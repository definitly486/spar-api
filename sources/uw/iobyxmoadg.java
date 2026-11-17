package uw;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.models.LocationData;
import ru.myspar.components.search_address.api.model.SearchAddress;
import ww.SearchAddressDto;
import ww.SearchAddressResponseDto;

/* JADX INFO: loaded from: classes4.dex */
public abstract class iobyxmoadg {
    public static final List iobyxmoadg(SearchAddressResponseDto searchAddressResponseDto) {
        zdlpuopuiu.btonecajqb(searchAddressResponseDto, "<this>");
        List searchAddressesDto = searchAddressResponseDto.getSearchAddressesDto();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(searchAddressesDto, 10));
        Iterator it = searchAddressesDto.iterator();
        while (it.hasNext()) {
            arrayList.add(zoijcleaow((SearchAddressDto) it.next()));
        }
        return arrayList;
    }

    public static final SearchAddress zoijcleaow(SearchAddressDto searchAddressDto) {
        zdlpuopuiu.btonecajqb(searchAddressDto, "<this>");
        return new SearchAddress(searchAddressDto.getFullAddress(), searchAddressDto.getShortAddress(), new LocationData(searchAddressDto.getLat(), searchAddressDto.getLong()));
    }
}
