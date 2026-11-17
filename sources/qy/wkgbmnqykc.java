package qy;

import java.util.Locale;
import kotlin.jvm.internal.zdlpuopuiu;
import sz.OrderReasonDto;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wkgbmnqykc {
    public static final c10.ppxfxbqfkf iobyxmoadg(OrderReasonDto orderReasonDto) {
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
        return new c10.ppxfxbqfkf(code, str, zdlpuopuiu.eablkybsjg(lowerCase, "own"));
    }
}
