package com.java.HotelService.service;

import com.java.HotelService.booking.Bill;
import com.java.HotelService.booking.Client;
import com.java.HotelService.booking.Hotel;
import com.java.HotelService.booking.Room;

public class BookingService {
    public void book(Hotel hotel, Client client, int amountOfPeople) {
        Room[] rooms = hotel.getRooms();
        boolean isFreeRooms = false;
        for (Room r : rooms) {
            if (r.isFree()) {
                isFreeRooms = true;
            }
        }

        if (!isFreeRooms) {
            System.out.println("Свободных номеров в отеле: " + hotel.getRooms() + " нет");
        }

        bookRoom(client, amountOfPeople, rooms);
    }


//Инкапсуляция

    private void bookRoom(Client client, int amountOfPeople, Room[] rooms) {
        String clientName = client.getName();
        boolean success = false;
        for (Room r : rooms) {
            if (r.getNumberOfPerson() == amountOfPeople) {
                success = true;
                System.out.println("Нашёлся номер для клиента: " + clientName);
                if (client.getBill().getAmountMoney() >= r.getCost()) {
                    Bill clientBill = client.getBill();
                    clientBill.setAmountMoney(clientBill.getAmountMoney() - r.getCost());
                    r.setFree(false);
                    System.out.println("Номер был успешно забронирован клиентом: " + clientName);
                } else {
                    System.out.println("Не достаточно денег для бронирования номера");
                }
            }
        }
        if (!success) {
            System.out.println("Не нашлось нужного номера для клиента: " + clientName);
        }
    }
}
