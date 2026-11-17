package modern.payments.tracker.util.extension;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0000¨\u0006\u0004"}, d2 = {"maskData", "", "paramsToMask", "", "ecomAndroid_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class StringExtensionsKt {
    public static final String maskData(String str, List<String> paramsToMask) {
        zdlpuopuiu.btonecajqb(str, "<this>");
        zdlpuopuiu.btonecajqb(paramsToMask, "paramsToMask");
        for (String str2 : paramsToMask) {
            str = new rgvfuqvkyq("\"?" + str2 + "\"?.*?[&,]").rgvfuqvkyq(str, '\"' + str2 + "\":\"***\"");
        }
        return str;
    }
}
