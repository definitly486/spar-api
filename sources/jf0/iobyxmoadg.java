package jf0;

import af0.ppxfxbqfkf;
import af0.zoijcleaow;
import kotlin.jvm.internal.zdlpuopuiu;
import mf0.LoymaxPopupButtonDto;
import mf0.LoymaxPopupContentDto;
import mf0.LoymaxPopupDto;
import mf0.LoymaxPopupStyleDto;

/* JADX INFO: loaded from: classes4.dex */
public abstract class iobyxmoadg {
    public static final af0.iobyxmoadg iobyxmoadg(LoymaxPopupDto loymaxPopupDto) {
        zdlpuopuiu.btonecajqb(loymaxPopupDto, "<this>");
        long id2 = loymaxPopupDto.getId();
        String navLink = loymaxPopupDto.getNavLink();
        String reference = loymaxPopupDto.getReference();
        LoymaxPopupContentDto content = loymaxPopupDto.getContent();
        zoijcleaow zoijcleaowVarZoijcleaow = content != null ? zoijcleaow(content) : null;
        LoymaxPopupStyleDto style = loymaxPopupDto.getStyle();
        return new af0.iobyxmoadg(id2, navLink, reference, zoijcleaowVarZoijcleaow, style != null ? ppxfxbqfkf(style) : null);
    }

    public static final ppxfxbqfkf ppxfxbqfkf(LoymaxPopupStyleDto loymaxPopupStyleDto) {
        zdlpuopuiu.btonecajqb(loymaxPopupStyleDto, "<this>");
        return new ppxfxbqfkf(loymaxPopupStyleDto.getMainColor(), loymaxPopupStyleDto.getSecondColor());
    }

    public static final zoijcleaow zoijcleaow(LoymaxPopupContentDto loymaxPopupContentDto) {
        zdlpuopuiu.btonecajqb(loymaxPopupContentDto, "<this>");
        String title = loymaxPopupContentDto.getTitle();
        String subtitle = loymaxPopupContentDto.getSubtitle();
        String imageUrl = loymaxPopupContentDto.getImageUrl();
        String text = loymaxPopupContentDto.getText();
        LoymaxPopupButtonDto button = loymaxPopupContentDto.getButton();
        return new zoijcleaow(title, subtitle, imageUrl, text, button != null ? button.getName() : null);
    }
}
