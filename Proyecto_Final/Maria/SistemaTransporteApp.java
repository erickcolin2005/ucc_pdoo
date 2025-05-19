import java.util.ArrayList;
import java.util.List;

// Enum para tipo de ruta
enum TipoRuta {
    URBANA,
    INTERMUNICIPAL,
    TURISTICA
}

// Builder para rutas
class RutaBuilder {
    String nombre;
    TipoRuta tipo;
    int numeroParadas;
    double kilometraje;
    String condicionesViales;
    String tipoVehiculo;
    String rutaContingencia;
    int limitePasajeros;
    boolean zonaCoberturaExtendida;

    public RutaBuilder setNombre(String nombre) { this.nombre = nombre; return this; }
    public RutaBuilder setTipo(TipoRuta tipo) { this.tipo = tipo; return this; }
    public RutaBuilder setNumeroParadas(int num) { this.numeroParadas = num; return this; }
    public RutaBuilder setKilometraje(double km) { this.kilometraje = km; return this; }
    public RutaBuilder setCondicionesViales(String condiciones) { this.condicionesViales = condiciones; return this; }
    public RutaBuilder setTipoVehiculo(String tipoVehiculo) { this.tipoVehiculo = tipoVehiculo; return this; }
    public RutaBuilder setRutaContingencia(String rutaContingencia) { this.rutaContingencia = rutaContingencia; return this; }
    public RutaBuilder setLimitePasajeros(int limite) { this.limitePasajeros = limite; return this; }
    public RutaBuilder setZonaCoberturaExtendida(boolean zona) { this.zonaCoberturaExtendida = zona; return this; }
}

// Clase base Ruta
abstract class Ruta {
    protected String nombre;
    protected TipoRuta tipo;
    protected int numeroParadas;
    protected double kilometraje;
    protected String condicionesViales;
    protected String tipoVehiculo;
    protected String rutaContingencia;
    protected int limitePasajeros;
    protected boolean zonaCoberturaExtendida;

    public Ruta(RutaBuilder builder) {
        this.nombre = builder.nombre;
        this.tipo = builder.tipo;
        this.numeroParadas = builder.numeroParadas;
        this.kilometraje = builder.kilometraje;
        this.condicionesViales = builder.condicionesViales;
        this.tipoVehiculo = builder.tipoVehiculo;
        this.rutaContingencia = builder.rutaContingencia;
        this.limitePasajeros = builder.limitePasajeros;
        this.zonaCoberturaExtendida = builder.zonaCoberturaExtendida;
    }

    public abstract void mostrarDetalles();
}

// Implementaciones para cada tipo de ruta

class RutaUrbana extends Ruta {
    public RutaUrbana(RutaBuilder builder) {
        super(builder);
    }
    @Override
    public void mostrarDetalles() {
        System.out.println("Ruta Urbana: " + nombre);
        System.out.println("Número de paradas: " + numeroParadas);
        System.out.println("Kilometraje: " + kilometraje);
        System.out.println("Condiciones viales: " + condicionesViales);
        System.out.println("Tipo vehículo: " + tipoVehiculo);
        System.out.println("Ruta contingencia: " + (rutaContingencia != null ? rutaContingencia : "No aplica"));
        System.out.println("Límite pasajeros: " + limitePasajeros);
        System.out.println("Zona cobertura extendida: " + (zonaCoberturaExtendida ? "Sí" : "No"));
        System.out.println("-----------------------------");
    }
}

class RutaIntermunicipal extends Ruta {
    public RutaIntermunicipal(RutaBuilder builder) {
        super(builder);
    }
    @Override
    public void mostrarDetalles() {
        System.out.println("Ruta Intermunicipal: " + nombre);
        System.out.println("Número de paradas: " + numeroParadas);
        System.out.println("Kilometraje: " + kilometraje);
        System.out.println("Condiciones viales: " + condicionesViales);
        System.out.println("Tipo vehículo: " + tipoVehiculo);
        System.out.println("Ruta contingencia: " + (rutaContingencia != null ? rutaContingencia : "No aplica"));
        System.out.println("Límite pasajeros: " + limitePasajeros);
        System.out.println("Zona cobertura extendida: " + (zonaCoberturaExtendida ? "Sí" : "No"));
        System.out.println("-----------------------------");
    }
}

class RutaTuristica extends Ruta {
    public RutaTuristica(RutaBuilder builder) {
        super(builder);
    }
    @Override
    public void mostrarDetalles() {
        System.out.println("Ruta Turística: " + nombre);
        System.out.println("Número de paradas: " + numeroParadas);
        System.out.println("Kilometraje: " + kilometraje);
        System.out.println("Condiciones viales: " + condicionesViales);
        System.out.println("Tipo vehículo: " + tipoVehiculo);
        System.out.println("Ruta contingencia: " + (rutaContingencia != null ? rutaContingencia : "No aplica"));
        System.out.println("Límite pasajeros: " + limitePasajeros);
        System.out.println("Zona cobertura extendida: " + (zonaCoberturaExtendida ? "Sí" : "No"));
        System.out.println("-----------------------------");
    }
}

// Factory para crear rutas según tipo
class RutaFactory {
    public static Ruta crearRuta(RutaBuilder builder) {
        switch (builder.tipo) {
            case URBANA:
                return new RutaUrbana(builder);
            case INTERMUNICIPAL:
                return new RutaIntermunicipal(builder);
            case TURISTICA:
                return new RutaTuristica(builder);
            default:
                throw new IllegalArgumentException("Tipo de ruta no soportado");
        }
    }
}

// --- Interfaces y clases para GPS ---

interface IGPSBus {
    String obtenerCoordenadas();
}

// GPS dispositivos simulados

class GarminGPS {
    public String obtenerPosicion() {
        return "Posición Garmin: 4.6789 N, -74.0456 W";
    }
}

class HuaweiGPS {
    public String getCoordenadas() {
        return "Posición Huawei: 4.6790 N, -74.0457 W";
    }
}

class TomTomGPS {
    public String coordenadasGPS() {
        return "Posición TomTom: 4.6791 N, -74.0458 W";
    }
}

// Adaptadores GPS

class GarminAdapter implements IGPSBus {
    private GarminGPS garmin;

    public GarminAdapter(GarminGPS garmin) {
        this.garmin = garmin;
    }

    @Override
    public String obtenerCoordenadas() {
        return garmin.obtenerPosicion();
    }
}

class HuaweiAdapter implements IGPSBus {
    private HuaweiGPS huawei; // 👈 Declaras el objeto

    public HuaweiAdapter(HuaweiGPS huawei) {
        this.huawei = huawei; // 👈 Lo inicializas desde el constructor
    }

    @Override
    public String obtenerCoordenadas() {
        return huawei.getCoordenadas();
    }
}


class TomTomAdapter implements IGPSBus {
    private TomTomGPS tomtom;

    public TomTomAdapter(TomTomGPS tomtom) {
        this.tomtom = tomtom;
    }

    @Override
    public String obtenerCoordenadas() {
        return tomtom.coordenadasGPS();
    }
}

// --- Observador ---

interface Observador {
    void actualizar(String info);
}

// Panel de llegadas

class PanelLlegadas implements Observador {
    @Override
    public void actualizar(String info) {
        System.out.println("[Panel Llegadas] Actualización: " + info);
    }
}

// Aplicación móvil

class AplicacionMovil implements Observador {
    @Override
    public void actualizar(String info) {
        System.out.println("[App Móvil] Notificación: " + info);
    }
}

// --- Clase Bus con GPS y Observadores ---

class Bus {
    private String id;
    private IGPSBus gps;
    private List<Observador> observadores = new ArrayList<>();

    public Bus(String id, IGPSBus gps) {
        this.id = id;
        this.gps = gps;
    }

    public void agregarObservador(Observador o) {
        if (!observadores.contains(o)) {
            observadores.add(o);
        }
    }

    public void eliminarObservador(Observador o) {
        observadores.remove(o);
    }

    public void notificarObservadores(String mensaje) {
        for (Observador o : observadores) {
            o.actualizar(mensaje);
        }
    }

    public void actualizarGPS() {
        String posicion = gps.obtenerCoordenadas();
        System.out.println("Bus " + id + " GPS actualizado: " + posicion);
        notificarObservadores("Bus " + id + " está en " + posicion);
    }
}

// --- Main app ---

public class SistemaTransporteApp {
  
        // Crear rutas
        List<Ruta> rutas = new ArrayList<>();
            public static void main(String[] args) {
                List<Ruta> rutas = new ArrayList<>();
        
        
            
                // Rutas iniciales del sistema
                rutas.add(RutaFactory.crearRuta(new RutaBuilder()
                    .setNombre("Ruta Central")
                    .setTipo(TipoRuta.URBANA)
                    .setNumeroParadas(15)
                    .setKilometraje(25.7)
                    .setCondicionesViales("Buena")
                    .setTipoVehiculo("Bus urbano")
                    .setRutaContingencia("Desvío por obras en calle 5")
                    .setLimitePasajeros(50)
                    .setZonaCoberturaExtendida(true)));
        
                rutas.add(RutaFactory.crearRuta(new RutaBuilder()
                    .setNombre("Ruta Cauca-Popayán")
                    .setTipo(TipoRuta.INTERMUNICIPAL)
                    .setNumeroParadas(8)
                    .setKilometraje(70.5)
                    .setCondicionesViales("Variable por lluvias")
                    .setTipoVehiculo("Bus intermunicipal")
                    .setRutaContingencia("Camino alternativo vía La Paila")
                    .setLimitePasajeros(40)
                    .setZonaCoberturaExtendida(false)));
        
                rutas.add(RutaFactory.crearRuta(new RutaBuilder()
                    .setNombre("Ruta Panorámica")
                    .setTipo(TipoRuta.TURISTICA)
                    .setNumeroParadas(10)
                    .setKilometraje(30.0)
                    .setCondicionesViales("Excelente")
                    .setTipoVehiculo("Microbús turístico")
                    .setLimitePasajeros(30)
                    .setZonaCoberturaExtendida(true)));
        
                // Rutas adicionales
                rutas.add(RutaFactory.crearRuta(new RutaBuilder()
                    .setNombre("Ruta Cali Norte")
                    .setTipo(TipoRuta.URBANA)
                    .setNumeroParadas(12)
                    .setKilometraje(15.3)
                    .setCondicionesViales("Pavimento en buen estado")
                    .setTipoVehiculo("Bus eléctrico")
                    .setLimitePasajeros(50)
                    .setZonaCoberturaExtendida(true)));
        
                rutas.add(RutaFactory.crearRuta(new RutaBuilder()
                    .setNombre("Ruta Silvia - Popayán")
                    .setTipo(TipoRuta.INTERMUNICIPAL)
                    .setNumeroParadas(5)
                    .setKilometraje(45.7)
                    .setCondicionesViales("Curvas, zona montañosa")
                    .setTipoVehiculo("Buseta")
                    .setRutaContingencia("Ruta alterna por El Tambo")
                    .setLimitePasajeros(30)));
        
                rutas.add(RutaFactory.crearRuta(new RutaBuilder()
                    .setNombre("Ruta Café y Tradición")
                    .setTipo(TipoRuta.TURISTICA)
                    .setNumeroParadas(8)
                    .setKilometraje(60.5)
                    .setCondicionesViales("Asfalto y caminos destapados")
                    .setTipoVehiculo("Jeep Willys")
                    .setRutaContingencia("Desvío por Pueblito Viejo")
                    .setZonaCoberturaExtendida(true)));
        
                rutas.add(RutaFactory.crearRuta(new RutaBuilder()
                    .setNombre("Ruta MIO Centro Histórico")
                    .setTipo(TipoRuta.URBANA)
                    .setNumeroParadas(10)
                    .setKilometraje(9.8)
                    .setCondicionesViales("Pavimento mixto")
                    .setTipoVehiculo("Bus articulado")
                    .setLimitePasajeros(60)));
        
                // Mostrar detalles de todas las rutas
                for (Ruta ruta : rutas) {
                    ruta.mostrarDetalles();
                }
        

        // Crear GPS y adaptadores
        GarminGPS garminGPS = new GarminGPS();
        HuaweiGPS huaweiGPS = new HuaweiGPS();
        TomTomGPS tomTomGPS = new TomTomGPS();

        IGPSBus garminAdapter = new GarminAdapter(garminGPS);
        IGPSBus huaweiAdapter = new HuaweiAdapter(huaweiGPS);
        IGPSBus tomTomAdapter = new TomTomAdapter(tomTomGPS);

        // Crear buses con GPS
        Bus bus1 =
        new Bus("Bus 101", garminAdapter);
        Bus bus2 = new Bus("Bus 202", huaweiAdapter);
        Bus bus3 = new Bus("Bus 303", tomTomAdapter);

            // Crear observadores
    PanelLlegadas panel = new PanelLlegadas();
    AplicacionMovil appMovil = new AplicacionMovil();

    // Asociar observadores a buses
    bus1.agregarObservador(panel);
    bus1.agregarObservador(appMovil);

    bus2.agregarObservador(panel);

    bus3.agregarObservador(appMovil);

    // Actualizar GPS y notificar
    bus1.actualizarGPS();
    bus2.actualizarGPS();
    bus3.actualizarGPS();
    }
}

        