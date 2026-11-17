package ze1;

import af1.ppxfxbqfkf;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import k21.ojitshcjhn;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import ow1.yggfygwlhe;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ze1.iobyxmoadg f129804iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final yggfygwlhe f129805ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ppxfxbqfkf f129806zoijcleaow;

    static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
        Object f129807cdpycssgdh;

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        Object f129808cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        Object f129809esjtqupxsv;

        /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
        Object f129810iozdgvuglv;

        /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
        Object f129811istkbnxepw;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        Object f129812iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f129813jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        Object f129814lereixgezr;

        /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
        boolean f129815lmojexxdyd;

        /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
        int f129816pkzmftpjix;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        Object f129817pmvmpeiblj;

        /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
        /* synthetic */ Object f129818wwaezpbzkn;

        /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
        Object f129819yadqdtsiqt;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f129820yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f129822zdlpuopuiu;

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        Object f129823zynmafqrjb;

        iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f129818wwaezpbzkn = obj;
            this.f129816pkzmftpjix |= Integer.MIN_VALUE;
            return zoijcleaow.this.ppxfxbqfkf(false, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: ze1.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C3302zoijcleaow implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return kg.iobyxmoadg.wkgbmnqykc(Integer.valueOf(((hh1.iobyxmoadg) obj).rgvfuqvkyq()), Integer.valueOf(((hh1.iobyxmoadg) obj2).rgvfuqvkyq()));
        }
    }

    public zoijcleaow(ze1.iobyxmoadg bannerListToUiModelList, ppxfxbqfkf featuresUiMapper, yggfygwlhe getUserNewsUseCase) {
        zdlpuopuiu.btonecajqb(bannerListToUiModelList, "bannerListToUiModelList");
        zdlpuopuiu.btonecajqb(featuresUiMapper, "featuresUiMapper");
        zdlpuopuiu.btonecajqb(getUserNewsUseCase, "getUserNewsUseCase");
        this.f129804iobyxmoadg = bannerListToUiModelList;
        this.f129806zoijcleaow = featuresUiMapper;
        this.f129805ppxfxbqfkf = getUserNewsUseCase;
    }

    private final List eablkybsjg(List list) {
        return jyumaefscl.d(list, new C3302zoijcleaow());
    }

    private final List iobyxmoadg(List list, boolean z13) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            hh1.iobyxmoadg iobyxmoadgVar = (hh1.iobyxmoadg) obj;
            if (z13 || !zoijcleaow(iobyxmoadgVar)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final m91.wkgbmnqykc wkgbmnqykc(hh1.ppxfxbqfkf ppxfxbqfkfVar, boolean z13) {
        return new m91.wkgbmnqykc(ppxfxbqfkfVar.ppxfxbqfkf(), this.f129804iobyxmoadg.iobyxmoadg(ppxfxbqfkfVar.zoijcleaow(), ppxfxbqfkfVar.ppxfxbqfkf(), eablkybsjg(iobyxmoadg(ppxfxbqfkfVar.iobyxmoadg(), z13))));
    }

    private final boolean zoijcleaow(hh1.iobyxmoadg iobyxmoadgVar) {
        return iobyxmoadgVar.draadjrbmk() == ojitshcjhn.PARTNERS || iobyxmoadgVar.draadjrbmk() == ojitshcjhn.PARTNER;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:57:0x0216  */
    /* JADX WARN: Code duplicated, block: B:60:0x0231  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x01c9 -> B:52:0x01e3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0237 -> B:62:0x0247). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object ppxfxbqfkf(boolean r27, java.lang.Integer r28, java.lang.Integer r29, java.util.List r30, lg.gxszxtbevo r31) {
        /*
            Method dump skipped, instruction units count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ze1.zoijcleaow.ppxfxbqfkf(boolean, java.lang.Integer, java.lang.Integer, java.util.List, lg.gxszxtbevo):java.lang.Object");
    }
}
