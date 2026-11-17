package ch1;

import fh1.PopupButtonDto;
import fh1.PopupContentDto;
import fh1.PopupDto;
import hh1.btonecajqb;
import hh1.draadjrbmk;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zoijcleaow {
    public static final btonecajqb iobyxmoadg(PopupDto popupDto) {
        zdlpuopuiu.btonecajqb(popupDto, "<this>");
        String id2 = popupDto.getId();
        String navLink = popupDto.getNavLink();
        String reference = popupDto.getReference();
        PopupContentDto content = popupDto.getContent();
        return new btonecajqb(id2, navLink, reference, content != null ? zoijcleaow(content, popupDto.getButton()) : null);
    }

    public static final draadjrbmk zoijcleaow(PopupContentDto popupContentDto, PopupButtonDto popupButtonDto) {
        zdlpuopuiu.btonecajqb(popupContentDto, "<this>");
        return new draadjrbmk(popupContentDto.getTitle(), popupContentDto.getSubtitle(), popupContentDto.getImageUrl(), popupContentDto.getText(), popupButtonDto != null ? popupButtonDto.getName() : null);
    }
}
