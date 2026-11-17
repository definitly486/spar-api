package ov0;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import qv0.SearchAddressDto;
import qv0.SearchAddressResponseDto;
import ru.myspar.proloyalty.common.models.LocationData;
import ru.myspar.proloyalty.components.search_address.api.model.SearchAddress;

/* JADX INFO: loaded from: classes5.dex */
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
