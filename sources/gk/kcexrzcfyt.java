package gk;

import java.util.List;
import kotlin.jvm.internal.cllcsxoeiz;

/* JADX INFO: loaded from: classes3.dex */
public abstract class kcexrzcfyt {

    public static final class iobyxmoadg implements dk.gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final gg.gtknphoqwx f37716iobyxmoadg;

        iobyxmoadg(tg.iobyxmoadg iobyxmoadgVar) {
            this.f37716iobyxmoadg = gg.draadjrbmk.zoijcleaow(iobyxmoadgVar);
        }

        private final dk.gxszxtbevo iobyxmoadg() {
            return (dk.gxszxtbevo) this.f37716iobyxmoadg.getValue();
        }

        @Override // dk.gxszxtbevo
        public boolean dxjokdxxww(int i13) {
            return iobyxmoadg().dxjokdxxww(i13);
        }

        @Override // dk.gxszxtbevo
        public String eablkybsjg(int i13) {
            return iobyxmoadg().eablkybsjg(i13);
        }

        @Override // dk.gxszxtbevo
        public List getAnnotations() {
            return dk.gxszxtbevo.iobyxmoadg.iobyxmoadg(this);
        }

        @Override // dk.gxszxtbevo
        public dk.agtfadlqog getKind() {
            return iobyxmoadg().getKind();
        }

        @Override // dk.gxszxtbevo
        public List gxszxtbevo(int i13) {
            return iobyxmoadg().gxszxtbevo(i13);
        }

        @Override // dk.gxszxtbevo
        public boolean isInline() {
            return dk.gxszxtbevo.iobyxmoadg.zoijcleaow(this);
        }

        @Override // dk.gxszxtbevo
        public dk.gxszxtbevo lqeggnwhkg(int i13) {
            return iobyxmoadg().lqeggnwhkg(i13);
        }

        @Override // dk.gxszxtbevo
        public String nufgyqmvbu() {
            return iobyxmoadg().nufgyqmvbu();
        }

        @Override // dk.gxszxtbevo
        public int ppxfxbqfkf(String name) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
            return iobyxmoadg().ppxfxbqfkf(name);
        }

        @Override // dk.gxszxtbevo
        public int wkgbmnqykc() {
            return iobyxmoadg().wkgbmnqykc();
        }

        @Override // dk.gxszxtbevo
        public boolean zoijcleaow() {
            return dk.gxszxtbevo.iobyxmoadg.ppxfxbqfkf(this);
        }
    }

    public static final zdlpuopuiu eablkybsjg(ek.gxszxtbevo gxszxtbevoVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(gxszxtbevoVar, "<this>");
        zdlpuopuiu zdlpuopuiuVar = gxszxtbevoVar instanceof zdlpuopuiu ? (zdlpuopuiu) gxszxtbevoVar : null;
        if (zdlpuopuiuVar != null) {
            return zdlpuopuiuVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + cllcsxoeiz.zoijcleaow(gxszxtbevoVar.getClass()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dk.gxszxtbevo gxszxtbevo(tg.iobyxmoadg iobyxmoadgVar) {
        return new iobyxmoadg(iobyxmoadgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lqeggnwhkg(ek.eablkybsjg eablkybsjgVar) {
        wkgbmnqykc(eablkybsjgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nufgyqmvbu(ek.gxszxtbevo gxszxtbevoVar) {
        eablkybsjg(gxszxtbevoVar);
    }

    public static final dxjokdxxww wkgbmnqykc(ek.eablkybsjg eablkybsjgVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(eablkybsjgVar, "<this>");
        dxjokdxxww dxjokdxxwwVar = eablkybsjgVar instanceof dxjokdxxww ? (dxjokdxxww) eablkybsjgVar : null;
        if (dxjokdxxwwVar != null) {
            return dxjokdxxwwVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + cllcsxoeiz.zoijcleaow(eablkybsjgVar.getClass()));
    }
}
