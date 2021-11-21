/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author Ehab Elsheikh
 */
public class memberFactory {
    public staff getStaff(String staffName)
    {   
        if(staffName.equalsIgnoreCase("teachingassistant") )
        {
           return new teachingAssistant();
        }
        else if (staffName.equalsIgnoreCase("doctor"))
        {
            return new doctor();
        }
        return null;
               
       }
}
