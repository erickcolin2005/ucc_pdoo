/* Proyecto Final - Sistema Integral para Terminal de Transporte Municipal
 
 * Historias: 4 (Asignación de Rutas), 5 (Venta de Tiquetes), 6 (Seguimiento de Buses)
 */

// ==============================
// Historia 4: Chain of Responsibility + Strategy
// ==============================
package com.terminal.asignacion;

// Entidad Bus
class Bus {
    String id;
    boolean conductorDisponible;
    boolean vehiculoEnBuenEstado;

    public Bus(String id, boolean conductorDisponible, boolean vehiculoEnBuenEstado) {
        this.id = id;
        this.conductorDisponible = conductorDisponible;
        this.vehiculoEnBuenEstado = vehiculoEnBuenEstado;
    }
}

// Handler base
abstract class ValidadorAsignacion {
    protected ValidadorAsignacion siguiente;
    public void setSiguiente(ValidadorAsignacion sig) {
        this.siguiente = sig;
    }
    public void validar(Bus bus) {
        if (evaluar(bus)) {
            if (siguiente != null) siguiente.validar(bus);
            else System.out.println("✅ Bus asignado correctamente");
        } else {
            System.out.println("❌ Asignación fallida en " + this.getClass().getSimpleName());
        }
    }
    protected abstract boolean evaluar(Bus bus);
}

class ValidadorConductor extends ValidadorAsignacion {
    protected boolean evaluar(Bus bus) {
        return bus.conductorDisponible;
    }
}

class ValidadorVehiculo extends ValidadorAsignacion {
    protected boolean evaluar(Bus bus) {
        return bus.vehiculoEnBuenEstado;
    }
}

// Strategy
interface EstrategiaAsignacion {
    void asignar(Bus bus);
}

class AsignacionPorPrioridadRuta implements EstrategiaAsignacion {
    public void asignar(Bus bus) {
        System.out.println("Asignando por prioridad de ruta al bus: " + bus.id);
    }
}

class GestorAsignacion {
    private ValidadorAsignacion validadorInicial;
    private EstrategiaAsignacion estrategia;

    public GestorAsignacion(ValidadorAsignacion validador, EstrategiaAsignacion estrategia) {
        this.validadorInicial = validador;
        this.estrategia = estrategia;
    }

    public void procesar(Bus bus) {
        validadorInicial.validar(bus);
        estrategia.asignar(bus);
    }
}

class MainAsignacion {
    public static void main(String[] args) {
        Bus bus = new Bus("Bus1", true, true);

        ValidadorConductor v1 = new ValidadorConductor();
        ValidadorVehiculo v2 = new ValidadorVehiculo();
        v1.setSiguiente(v2);

        EstrategiaAsignacion estrategia = new AsignacionPorPrioridadRuta();
        GestorAsignacion gestor = new GestorAsignacion(v1, estrategia);

        gestor.procesar(bus);
    }
}

// ==============================
// Historia 5: Decorator + Proxy
// ==============================
package com.terminal.venta;

interface Tiquete {
    String descripcion();
    double calcularPrecio();
}

class TiqueteBasico implements Tiquete {
    public String descripcion() {
        return "Tiquete básico";
    }
    public double calcularPrecio() {
        return 5000;
    }
}

abstract class TiqueteDecorator implements Tiquete {
    protected Tiquete tiquete;
    public TiqueteDecorator(Tiquete t) {
        this.tiquete = t;
    }
}

class SeguroViaje extends TiqueteDecorator {
    public SeguroViaje(Tiquete t) {
        super(t);
    }
    public String descripcion() {
        return tiquete.descripcion() + ", con Seguro de Viaje";
    }
    public double calcularPrecio() {
        return tiquete.calcularPrecio() + 2000;
    }
}

class DescuentoEstudiante extends TiqueteDecorator {
    public DescuentoEstudiante(Tiquete t) {
        super(t);
    }
    public String descripcion() {
        return tiquete.descripcion() + ", con Descuento Estudiante";
    }
    public double calcularPrecio() {
        return tiquete.calcularPrecio() * 0.8;
    }
}

class ProxyTiquete {
    private String rolUsuario;

    public ProxyTiquete(String rolUsuario) {
        this.rolUsuario = rolUsuario;
    }

    public void vender() {
        System.out.println("Venta realizada exitosamente");
    }

    public void reimprimir() {
        if (rolUsuario.equals("ADMIN")) {
            System.out.println("Reimpresión autorizada");
        } else {
            System.out.println("❌ Acceso denegado a reimprimir");
        }
    }
}

class MainVenta {
    public static void main(String[] args) {
        Tiquete t = new TiqueteBasico();
        t = new SeguroViaje(t);
        t = new DescuentoEstudiante(t);

        System.out.println("🧾 " + t.descripcion());
        System.out.println("💵 Precio final: " + t.calcularPrecio());

        ProxyTiquete proxy = new ProxyTiquete("USER");
        proxy.vender();
        proxy.reimprimir();
    }
}

// ==============================
// Historia 6: State + Mediator
// ==============================
package com.terminal.seguimiento;

interface EstadoBus {
    void manejarEstado(BusContexto contexto);
}

class EnPlataforma implements EstadoBus {
    public void manejarEstado(BusContexto contexto) {
        System.out.println("El bus está en plataforma");
        contexto.notificar("🅿️ Bus en plataforma");
    }
}

class EnRuta implements EstadoBus {
    public void manejarEstado(BusContexto contexto) {
        System.out.println("El bus está en ruta");
        contexto.notificar("🚍 Bus en ruta");
    }
}

class Detenido implements EstadoBus {
    public void manejarEstado(BusContexto contexto) {
        System.out.println("El bus está detenido");
        contexto.notificar("⛔ Bus detenido");
    }
}

interface MediadorTerminal {
    void notificarCambioEstado(String busId, String mensaje);
}

class CentroOperaciones implements MediadorTerminal {
    public void notificarCambioEstado(String busId, String mensaje) {
        System.out.println("[Centro de Operaciones] " + busId + ": " + mensaje);
    }
}

class BusContexto {
    private String id;
    private EstadoBus estado;
    private MediadorTerminal mediador;

    public BusContexto(String id, MediadorTerminal mediador) {
        this.id = id;
        this.mediador = mediador;
    }

    public void setEstado(EstadoBus estado) {
        this.estado = estado;
        estado.manejarEstado(this);
    }

    public void notificar(String mensaje) {
        mediador.notificarCambioEstado(id, mensaje);
    }
}

class MainSeguimiento {
    public static void main(String[] args) {
        MediadorTerminal centro = new CentroOperaciones();
        BusContexto bus = new BusContexto("BusX", centro);

        bus.setEstado(new EnPlataforma());
        bus.setEstado(new EnRuta());
        bus.setEstado(new Detenido());
    }
}
