/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.ugent.maf.cellmissy.entity.result.singlecell;

import java.util.List;

/**
 * This class keeps the measurements about a certain track, on a cell-centric
 * level, i.e. averaged across all the time points.
 *
 * @author Paola Masuzzo <paola.masuzzo@ugent.be>
 */
public class CellCentricDataHolder {

    // track duration, in minutes
    private double trackDuration;
    // the bounding box
    private BoundingBox boundingBox;
    // track median displacement
    // this is the median displacement computed from all time intervals throughout a track
    private double medianDisplacement;
    // track median speed
    // this is the track median displacement divided by the track duration (time interval in which the cell has been tracked)
    private double medianSpeed;
    // double for cumulative distance (between first and last time point of the track)
    // this is the total path length travelled by the cell in its displacement
    private double cumulativeDistance;
    // double for euclidean distance (between first and last time point of the track)
    // this is the real displacement of the cell in its motion (the net distance traveled), tipically smaller than the cumulative distance
    private double euclideanDistance;
    // directionality: this is  the ratio between the euclidean and the cumulative distance
    // this parameter is also known in literature as confinement ratio or meandering index
    // since the path length is at least equal to the displacement, this coefficient can vary between 0 and 1
    private double endPointDirectionalityRatio;
    // median directionality ratio
    // when computed in time (not end-point measurement!), the median directionality ratio is derived
    private double medianDirectionalityRatio;
    // the convex hull of the track: the convex polygon containing all the points of the track
    private ConvexHull convexHull;
    // displacement ratio: displacement/maximal displacement
    private double displacementRatio;
    // outreach ratio: maximal displacement/path length
    private double outreachRatio;
    // track angle: the median turning angle computed from all time intervals throughout a track
    private double medianTurningAngle;
    // the track entropies -- an entropy entry for each enclosing ball radius
    private List<Double> entropies;
    // the x-y fractal dimension (FD) of the track
    private FractalDimension xYFD;
    // the x-t fractal dimension
    private FractalDimension xTFD;
    // the y-t fractal dimension
    private FractalDimension yTFD;
    //@todo: to be deleted afterwards, for testing only
    private int label;
    // the root mean squared deviation from average displacement
    private double RMSDeviation;
    // the median direction autocorrelation, computed for time interval of size 1
    private double medianDirectionAutocorrelation;

    /**
     * Empty Constructor
     */
    public CellCentricDataHolder() {
    }

    /**
     * Getters and setters.
     *
     * @return
     */
    public double getTrackDuration() {
        return trackDuration;
    }

    public void setTrackDuration(double trackDuration) {
        this.trackDuration = trackDuration;
    }

    public BoundingBox getBoundingBox() {
        return boundingBox;
    }

    public void setBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
    }

    public double getMedianDisplacement() {
        return medianDisplacement;
    }

    public void setMedianDisplacement(double medianDisplacement) {
        this.medianDisplacement = medianDisplacement;
    }

    public double getMedianSpeed() {
        return medianSpeed;
    }

    public void setMedianSpeed(double medianSpeed) {
        this.medianSpeed = medianSpeed;
    }

    public double getCumulativeDistance() {
        return cumulativeDistance;
    }

    public void setCumulativeDistance(double cumulativeDistance) {
        this.cumulativeDistance = cumulativeDistance;
    }

    public double getEuclideanDistance() {
        return euclideanDistance;
    }

    public void setEuclideanDistance(double euclideanDistance) {
        this.euclideanDistance = euclideanDistance;
    }

    public double getEndPointDirectionalityRatio() {
        return endPointDirectionalityRatio;
    }

    public void setEndPointDirectionalityRatio(double endPointDirectionalityRatio) {
        this.endPointDirectionalityRatio = endPointDirectionalityRatio;
    }

    public double getMedianDirectionalityRatio() {
        return medianDirectionalityRatio;
    }

    public void setMedianDirectionalityRatio(double medianDirectionalityRatio) {
        this.medianDirectionalityRatio = medianDirectionalityRatio;
    }

    public ConvexHull getConvexHull() {
        return convexHull;
    }

    public void setConvexHull(ConvexHull convexHull) {
        this.convexHull = convexHull;
    }

    public double getDisplacementRatio() {
        return displacementRatio;
    }

    public void setDisplacementRatio(double displacementRatio) {
        this.displacementRatio = displacementRatio;
    }

    public double getOutreachRatio() {
        return outreachRatio;
    }

    public void setOutreachRatio(double outreachRatio) {
        this.outreachRatio = outreachRatio;
    }

    public double getMedianTurningAngle() {
        return medianTurningAngle;
    }

    public void setMedianTurningAngle(double medianTurningAngle) {
        this.medianTurningAngle = medianTurningAngle;
    }

    public List<Double> getEntropies() {
        return entropies;
    }

    public void setEntropies(List<Double> entropies) {
        this.entropies = entropies;
    }

    public FractalDimension getxYFD() {
        return xYFD;
    }

    public void setxYFD(FractalDimension xYFD) {
        this.xYFD = xYFD;
    }

    public FractalDimension getxTFD() {
        return xTFD;
    }

    public void setxTFD(FractalDimension xTFD) {
        this.xTFD = xTFD;
    }

    public FractalDimension getyTFD() {
        return yTFD;
    }

    public void setyTFD(FractalDimension yTFD) {
        this.yTFD = yTFD;
    }

    public int getLabel() {
        return label;
    }

    public void setLabel(int label) {
        this.label = label;
    }

    public double getRMSDeviation() {
        return RMSDeviation;
    }

    public void setRMSDeviation(double RMSDeviation) {
        this.RMSDeviation = RMSDeviation;
    }

    public double getMedianDirectionAutocorrelation() {
        return medianDirectionAutocorrelation;
    }

    public void setMedianDirectionAutocorrelation(double medianDirectionAutocorrelation) {
        this.medianDirectionAutocorrelation = medianDirectionAutocorrelation;
    }
}
