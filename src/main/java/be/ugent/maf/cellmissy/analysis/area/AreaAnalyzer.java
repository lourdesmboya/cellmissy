/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.ugent.maf.cellmissy.analysis.area;

import be.ugent.maf.cellmissy.entity.result.area.AreaAnalysisResults;
import be.ugent.maf.cellmissy.entity.result.area.AreaPreProcessingResults;

/**
 * Interface for Analysis of Area Data (after pre-processing step)
 *
 * @author Paola Masuzzo <paola.masuzzo@ugent.be>
 */
public interface AreaAnalyzer {

    /**
     * Estimate Linear Regression Model: compute slopes and R squared
     * coefficients
     *
     * @param areaPreProcessingResults
     * @param areaAnalysisResults
     * @param useCorrectedData
     * @param measuredAreaType
     * @param timeFrames
     */
    void estimateLinearModel(AreaPreProcessingResults areaPreProcessingResults, AreaAnalysisResults areaAnalysisResults, boolean useCorrectedData, MeasuredAreaType measuredAreaType, double[] timeFrames);
}
