/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.ugent.maf.cellmissy.analysis;

/**
 *
 * @author Paola Masuzzo
 */
public interface LinearRegressor {

    public double computeSlope(double[][] data);
}