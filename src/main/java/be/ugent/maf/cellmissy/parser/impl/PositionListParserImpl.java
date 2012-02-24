/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.ugent.maf.cellmissy.parser.impl;

import be.ugent.maf.cellmissy.entity.ImagingType;
import be.ugent.maf.cellmissy.entity.WellHasImagingType;
import be.ugent.maf.cellmissy.parser.PositionListParser;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;

/**
 *
 * @author Paola
 */
@Service("positionListParser")
public class PositionListParserImpl implements PositionListParser {

    @Override
    public Map<ImagingType, List<WellHasImagingType>> parsePositionList(Map<ImagingType, String> imagingTypePositionListMap, File microscopeFolder) {

        Map<ImagingType, List<WellHasImagingType>> imagingTypeListOfWellHasImagingTypeMap = new HashMap<ImagingType, List<WellHasImagingType>>();

        // look for the text files to parse
        for (ImagingType imagingType : imagingTypePositionListMap.keySet()) {
            String positionList = imagingTypePositionListMap.get(imagingType);
            List<WellHasImagingType> wellHasImagingTypeList = new ArrayList<WellHasImagingType>();
            File[] listFiles = microscopeFolder.listFiles();
            for (int j = 0; j < listFiles.length; j++) {

                if (listFiles[j].getName().equals(positionList + ".txt")) {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new FileReader(listFiles[j]));
                        String strRead;
                        while ((strRead = bufferedReader.readLine()) != null) {

                            // create a new WellHasImagingType entity
                            WellHasImagingType wellHasImagingType = new WellHasImagingType();

                            String[] splitarray = strRead.split("\t");

                            // set wellHasImagingType class members
                            wellHasImagingType.setXCoordinate(Double.parseDouble(splitarray[0]));
                            wellHasImagingType.setYCoordinate(Double.parseDouble(splitarray[1]));
                            wellHasImagingType.setImagingType(imagingType);

                            // add wellHasImagingType to the list
                            wellHasImagingTypeList.add(wellHasImagingType);

                            // set wellHasImagingType sequence number
                            wellHasImagingType.setSequenceNumber(wellHasImagingTypeList.size());

                            // set wellHasImagingTypeCollection of imaging type
                            imagingType.setWellHasImagingTypeCollection(wellHasImagingTypeList);
                        }

                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    imagingTypeListOfWellHasImagingTypeMap.put(imagingType, wellHasImagingTypeList);
                }
            }
        }
        return imagingTypeListOfWellHasImagingTypeMap;
    }
}