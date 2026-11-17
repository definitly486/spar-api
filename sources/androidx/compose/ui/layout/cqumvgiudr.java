package androidx.compose.ui.layout;

import java.util.ArrayList;
import java.util.List;
import z.pkzmftpjix;

/* JADX INFO: loaded from: classes.dex */
public final class cqumvgiudr extends pkzmftpjix.gxszxtbevo {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final cqumvgiudr f6472zoijcleaow = new cqumvgiudr();

    static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final iobyxmoadg f6473zdlpuopuiu = new iobyxmoadg();

        iobyxmoadg() {
            super(1);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((kcexrzcfyt.iobyxmoadg) obj);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(kcexrzcfyt.iobyxmoadg iobyxmoadgVar) {
        }
    }

    static final class ppxfxbqfkf extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ List f6474zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(List list) {
            super(1);
            this.f6474zdlpuopuiu = list;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((kcexrzcfyt.iobyxmoadg) obj);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(kcexrzcfyt.iobyxmoadg iobyxmoadgVar) {
            List list = this.f6474zdlpuopuiu;
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                kcexrzcfyt.iobyxmoadg.jlmebxxoox(iobyxmoadgVar, (kcexrzcfyt) list.get(i13), 0, 0, 0.0f, null, 12, null);
            }
        }
    }

    static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ kcexrzcfyt f6475zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(kcexrzcfyt kcexrzcfytVar) {
            super(1);
            this.f6475zdlpuopuiu = kcexrzcfytVar;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((kcexrzcfyt.iobyxmoadg) obj);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(kcexrzcfyt.iobyxmoadg iobyxmoadgVar) {
            kcexrzcfyt.iobyxmoadg.jlmebxxoox(iobyxmoadgVar, this.f6475zdlpuopuiu, 0, 0, 0.0f, null, 12, null);
        }
    }

    private cqumvgiudr() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // x.zynmafqrjb
    public x.istkbnxepw lqeggnwhkg(draadjrbmk draadjrbmkVar, List list, long j13) {
        int size = list.size();
        if (size == 0) {
            return draadjrbmk.ntlheqmsrt(draadjrbmkVar, w0.zoijcleaow.agtfadlqog(j13), w0.zoijcleaow.wflxmlrfwp(j13), null, iobyxmoadg.f6473zdlpuopuiu, 4, null);
        }
        if (size == 1) {
            kcexrzcfyt kcexrzcfytVarSflfametgt = ((x.pmvmpeiblj) list.get(0)).sflfametgt(j13);
            return draadjrbmk.ntlheqmsrt(draadjrbmkVar, w0.ppxfxbqfkf.lqeggnwhkg(j13, kcexrzcfytVarSflfametgt.eslsurpljm()), w0.ppxfxbqfkf.gxszxtbevo(j13, kcexrzcfytVarSflfametgt.ipoelvxyzq()), null, new zoijcleaow(kcexrzcfytVarSflfametgt), 4, null);
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i13 = 0; i13 < size2; i13++) {
            kcexrzcfyt kcexrzcfytVarSflfametgt2 = ((x.pmvmpeiblj) list.get(i13)).sflfametgt(j13);
            iMax = Math.max(kcexrzcfytVarSflfametgt2.eslsurpljm(), iMax);
            iMax2 = Math.max(kcexrzcfytVarSflfametgt2.ipoelvxyzq(), iMax2);
            arrayList.add(kcexrzcfytVarSflfametgt2);
        }
        return draadjrbmk.ntlheqmsrt(draadjrbmkVar, w0.ppxfxbqfkf.lqeggnwhkg(j13, iMax), w0.ppxfxbqfkf.gxszxtbevo(j13, iMax2), null, new ppxfxbqfkf(arrayList), 4, null);
    }
}
