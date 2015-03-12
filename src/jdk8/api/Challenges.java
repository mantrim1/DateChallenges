/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdk8.api;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;
/**
 *
 * @author Mark
 */
public class Challenges {
    //Challenge 1 promotions begin wed know what date of each wed in april
    public static void main(String[] args) {
        
    
    LocalDate today2 = LocalDate.of(2015, Month.APRIL, 1);
        LocalDate lastBusDay = today2.with(TemporalAdjusters.firstInMonth(DayOfWeek.WEDNESDAY));
         int intDate=lastBusDay.getDayOfMonth();
         
//        today2 =LocalDate.of(2015, Month.APRIL, intDate);
//            System.out.println(today2);
        while(intDate<31){
            
        today2 =LocalDate.of(2015, Month.APRIL, intDate);
            System.out.println(today2);
        intDate+=7;
        }
    }
    }
