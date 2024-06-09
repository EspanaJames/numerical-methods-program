/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numericalmethod;

import org.mariuszgromada.math.mxparser.License;
import org.mariuszgromada.math.mxparser.mXparser;
/**
 *
 * @author Admin
 */
public class NumericalMethod {

    public static void main(String[] args) {
        boolean isCallSuccessful = License.iConfirmNonCommercialUse("University of Bohol");
 
/* Verification if use type has been already confirmed */
        boolean isConfirmed = License.checkIfUseTypeConfirmed();
 
/* Checking use type confirmation message */
        String message = License.getUseTypeConfirmationMessage();
 
/* ----------- */
        mXparser.consolePrintln("isCallSuccessful = " + isCallSuccessful);
        mXparser.consolePrintln("isConfirmed = " + isConfirmed);
        mXparser.consolePrintln("message = " + message);
        Calculator call = new Calculator();
        call.setVisible(true);
    }
}
