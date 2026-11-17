package lx0;

import java.util.Locale;
import kotlin.jvm.internal.zdlpuopuiu;
import ky0.OrderReasonDto;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gxszxtbevo {
    public static final sz0.zoijcleaow iobyxmoadg(OrderReasonDto orderReasonDto) {
        String lowerCase;
        zdlpuopuiu.btonecajqb(orderReasonDto, "<this>");
        String code = orderReasonDto.getCode();
        if (code == null) {
            code = "";
        }
        String title = orderReasonDto.getTitle();
        String str = title != null ? title : "";
        String code2 = orderReasonDto.getCode();
        if (code2 != null) {
            Locale locale = Locale.getDefault();
            zdlpuopuiu.dxjokdxxww(locale, "getDefault(...)");
            lowerCase = code2.toLowerCase(locale);
            zdlpuopuiu.dxjokdxxww(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = null;
        }
        return new sz0.zoijcleaow(code, str, zdlpuopuiu.eablkybsjg(lowerCase, "own"));
    }
}
