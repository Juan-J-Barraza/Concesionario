import Class.*;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Client client = new Client("Juan", "Barraza", "DNI", "12345678");
        // objects Seller
        Seller seller = new Seller("Pedro", "Pérez", "123456789", "Calle Falsa 123");
        Seller seller2 = new Seller("Fernando", "Hernandez", "23456778", "Calle inventada 234433");
        
        // objects Concessionaire
        Concessionaire concessionaire = new Concessionaire("Concesionario ABC", "NIT123456");
        concessionaire.getListSellers().add(seller);
        concessionaire.getListSellers().add(seller2);
        
        // objects Service
        Service service = new Service("Servicio de Mantenimiento", "Calle Real 456", "NIF654321");
        concessionaire.getListServices().add(service);
        Service serrvice2 = new Service("Servicio de venta", "CLL troncal 3", "NIF34353454353");

        // objects equpment
        Equipment equipment1 = new Equipment("Aire Acondicionado", "Climatización", "Aire frío/calor");
        Equipment equipment2 = new Equipment("Sensor de Estacionamiento", "Seguridad", "Sensor trasero");

        // objects ExtraEquipment
        ExtraEquipment extra1 = new ExtraEquipment("Alarma", "150");
        ExtraEquipment extra2 = new ExtraEquipment("Cámara de reversa", "200");

        // objects Car
        Car car = new Car("ABC1234", 20000.0f, "Motor V6", "200 HP", "Toyota", "Corolla", "Nuevo", "red color");
        car.getListEquipmets().add(equipment1);
        car.getListEquipmets().add(equipment2);
        car.getListAvailableExtras().add(extra1);
        car.getListAvailableExtras().add(extra2);
        Car car2 = new Car("ABC1235", 250000.0f, "Motor V100", "600 HP", "Toyota", "TXL", "Nuevo", "black color");
        car2.getListEquipmets().add(equipment1);
        car2.getListEquipmets().add(equipment2);
        car2.getListAvailableExtras().add(extra2);
        
        // objects Inventory
        Inventory inventory = new Inventory(concessionaire);
        inventory.getListCars().add(car);
        inventory.getListCars().add(car2);
        inventory.getLocationServices().add(service);
        inventory.getLocationServices().add(serrvice2);

        // objects Document
        Document document = new Document("Tarjeta de Crédito", new Date(), client, car, seller);
        document.getListExtraEquipments().add(extra1);
        document.getListExtraEquipments().add(extra2);

        // objects Sale
        Sale sale = new Sale("REG001", "concessionaire", document);


        // objects TypeConcessionaire
        TypeConcessionaire typeConcessionaire = new TypeConcessionaire("Toyota", concessionaire, car);

        System.out.println("Concessionaire: " + typeConcessionaire.getConcesionarie().getName());
        System.out.println("Car Model: " + typeConcessionaire.getCar().getModels());
        System.out.println("Sale Registration: " + sale.getRegistration());
        System.out.println("Client Name: " + document.getClient().getName());
        System.out.println("Extra Equipment: " + document.getListExtraEquipments().get(0).getName() + document.getListExtraEquipments().get(1));
        System.out.println("Available Extras List: " + car.getListAvailableExtras());
        System.out.println("Extra Equipment: " + document.getListExtraEquipments().get(0).getName());
        System.out.println("Servicios Disponibles en el Concessionaire:");


        System.out.println("this is a inventory of cars: " + inventory.getListCars());
        System.out.println("his location of inventory: " + inventory.getLocation().getName());
        System.out.println("his location inventory of service: " + inventory.getLocationServices());
    }

}