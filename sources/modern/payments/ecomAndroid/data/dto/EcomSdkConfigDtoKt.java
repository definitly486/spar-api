package modern.payments.ecomAndroid.data.dto;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a,\u0010\u0000\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¨\u0006\u0005"}, d2 = {"toModel", "", "", "", "Lmodern/payments/ecomAndroid/data/dto/EcomSdkConfigDto$ServiceDto;", "ecomAndroid_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class EcomSdkConfigDtoKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<String, Map<String, String>> toModel(List<EcomSdkConfigDto.ServiceDto> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            linkedHashMap.putAll(((EcomSdkConfigDto.ServiceDto) it.next()).toModel2());
        }
        return linkedHashMap;
    }
}
