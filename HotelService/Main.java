package com.java.HotelService;

//В данном домашнем задании нужно написать систему бронировния номеров в отеле.
//        Сущности: Client, Hotel, Room, Bill.
//
//        Client будет содержать поля: имя, фамилию, номер телефона, почту, ссылку на Bill
//        В Bill будет сумма денег
//        Hotel будет содеражть поля: имя отеля, список номеров
//        Room будет содеражть колличество человек, которых можно разместить, стоимость этого номера и свободен ли этот номер
//
//        Сценарии:
//        Нужно создать нескольких клиентов с счетами и внести им первоначальную сумму. Так же нужно создать
//        несколько отелей, с разными наборами номеров (В списке внутри сущности Hotel)
//        Клиент должен попробовать забронировать номер, для этого он так же указывает
//        сколько человек в номере ему нужно разместить. После успешного бронирования списывать сумму со счета клиента.
//
//        Так же при бронировании проверять есть ли свободные номера
//
//        В одном из сценариев, клиенту должно не хватить денег для бронирования номера
//
//        В методе main не нужно проводить никаких операций, кроме создания начальных объектов, сервисов и вызова их методов

import com.java.HotelService.booking.Bill;
import com.java.HotelService.booking.Client;
import com.java.HotelService.booking.Hotel;
import com.java.HotelService.booking.Room;
import com.java.HotelService.service.BookingService;

public class Main {
    public static void main(String[] args) {
        Bill alexBill = new Bill(10000);
        Client alexClint = new Client("Alex", "Nahaychuk", "+3754658818", "alex@mail.ru", alexBill);

        Bill sergioBill = new Bill(20000);
        Client sergioClient = new Client("Sergio", "Agafonov", "+375262566", "sergio@mail.ru", sergioBill);

        Room[] californiaHotelRooms = new Room[]{new Room(3, 3500, true), new Room(1, 1500, true), new Room(2, 2500, true)};
        Hotel californiaHotel = new Hotel("California", californiaHotelRooms);

        Room[] sanfranciscoRooms = new Room[]{new Room(2, 2800, true), new Room(3, 14000, true), new Room(1, 2000, true)};
        Hotel sanfranciscoHotel = new Hotel("SanFrancisco", sanfranciscoRooms);

        BookingService bookingService = new BookingService();
        bookingService.book(californiaHotel, alexClint, 2);
        System.out.println("\n");
        bookingService.book(californiaHotel, alexClint, 4);
        System.out.println("\n");
        bookingService.book(sanfranciscoHotel, sergioClient, 3);
    }
}
