package y42;

import c52.jpowsppfya;
import c52.vdvldrhtss;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import z42.dxjokdxxww;

/* JADX INFO: loaded from: classes6.dex */
public abstract class iobyxmoadg {
    public static final vdvldrhtss.iobyxmoadg iobyxmoadg(dxjokdxxww.LoyaltyProgramDto.LoyaltyProgramInfoDto loyaltyProgramInfoDto) {
        zdlpuopuiu.btonecajqb(loyaltyProgramInfoDto, "<this>");
        return new vdvldrhtss.iobyxmoadg(loyaltyProgramInfoDto.getPercent(), loyaltyProgramInfoDto.getText(), loyaltyProgramInfoDto.getCategories(), f40.zoijcleaow.f32832yggfygwlhe.iobyxmoadg(loyaltyProgramInfoDto.getNavLink()), loyaltyProgramInfoDto.getReference());
    }

    public static final vdvldrhtss.ppxfxbqfkf ppxfxbqfkf(dxjokdxxww.LoyaltyProgramDto.LoyaltyProgramDtoLevel loyaltyProgramDtoLevel) {
        zdlpuopuiu.btonecajqb(loyaltyProgramDtoLevel, "<this>");
        String title = loyaltyProgramDtoLevel.getTitle();
        String month = loyaltyProgramDtoLevel.getMonth();
        boolean blocked = loyaltyProgramDtoLevel.getBlocked();
        boolean locks = loyaltyProgramDtoLevel.getLocks();
        List info = loyaltyProgramDtoLevel.getInfo();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(info, 10));
        Iterator it = info.iterator();
        while (it.hasNext()) {
            arrayList.add(iobyxmoadg((dxjokdxxww.LoyaltyProgramDto.LoyaltyProgramInfoDto) it.next()));
        }
        dxjokdxxww.LoyaltyProgramDto.LoyaltyProgramProgressDto progress = loyaltyProgramDtoLevel.getProgress();
        return new vdvldrhtss.ppxfxbqfkf(title, month, blocked, locks, arrayList, progress != null ? zoijcleaow(progress) : null);
    }

    public static final vdvldrhtss wkgbmnqykc(dxjokdxxww.LoyaltyProgramDto loyaltyProgramDto) {
        zdlpuopuiu.btonecajqb(loyaltyProgramDto, "<this>");
        int index = loyaltyProgramDto.getIndex();
        jpowsppfya jpowsppfyaVar = jpowsppfya.LOYALTY_PROGRAM;
        List items = loyaltyProgramDto.getData().getItems();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(items, 10));
        Iterator it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(ppxfxbqfkf((dxjokdxxww.LoyaltyProgramDto.LoyaltyProgramDtoLevel) it.next()));
        }
        return new vdvldrhtss(index, jpowsppfyaVar, arrayList);
    }

    public static final vdvldrhtss.zoijcleaow zoijcleaow(dxjokdxxww.LoyaltyProgramDto.LoyaltyProgramProgressDto loyaltyProgramProgressDto) {
        zdlpuopuiu.btonecajqb(loyaltyProgramProgressDto, "<this>");
        return new vdvldrhtss.zoijcleaow(loyaltyProgramProgressDto.getTitle(), loyaltyProgramProgressDto.getCurrent(), loyaltyProgramProgressDto.getNeed());
    }
}
