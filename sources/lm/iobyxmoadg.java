package lm;

import gg.wwaezpbzkn;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import lk.istkbnxepw;
import lk.yadqdtsiqt;

/* JADX INFO: loaded from: classes3.dex */
final class iobyxmoadg extends lm.gxszxtbevo.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private boolean f63447iobyxmoadg = true;

    static final class eablkybsjg implements lm.gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final eablkybsjg f63448iobyxmoadg = new eablkybsjg();

        eablkybsjg() {
        }

        @Override // lm.gxszxtbevo
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public wwaezpbzkn convert(yadqdtsiqt yadqdtsiqtVar) {
            yadqdtsiqtVar.close();
            return wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class gxszxtbevo implements lm.gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final gxszxtbevo f63449iobyxmoadg = new gxszxtbevo();

        gxszxtbevo() {
        }

        @Override // lm.gxszxtbevo
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public Void convert(yadqdtsiqt yadqdtsiqtVar) {
            yadqdtsiqtVar.close();
            return null;
        }
    }

    /* JADX INFO: renamed from: lm.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C1294iobyxmoadg implements lm.gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final C1294iobyxmoadg f63450iobyxmoadg = new C1294iobyxmoadg();

        C1294iobyxmoadg() {
        }

        @Override // lm.gxszxtbevo
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public yadqdtsiqt convert(yadqdtsiqt yadqdtsiqtVar) {
            try {
                return cqumvgiudr.iobyxmoadg(yadqdtsiqtVar);
            } finally {
                yadqdtsiqtVar.close();
            }
        }
    }

    static final class ppxfxbqfkf implements lm.gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final ppxfxbqfkf f63451iobyxmoadg = new ppxfxbqfkf();

        ppxfxbqfkf() {
        }

        @Override // lm.gxszxtbevo
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public yadqdtsiqt convert(yadqdtsiqt yadqdtsiqtVar) {
            return yadqdtsiqtVar;
        }
    }

    static final class wkgbmnqykc implements lm.gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final wkgbmnqykc f63452iobyxmoadg = new wkgbmnqykc();

        wkgbmnqykc() {
        }

        @Override // lm.gxszxtbevo
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public String convert(Object obj) {
            return obj.toString();
        }
    }

    static final class zoijcleaow implements lm.gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final zoijcleaow f63453iobyxmoadg = new zoijcleaow();

        zoijcleaow() {
        }

        @Override // lm.gxszxtbevo
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public istkbnxepw convert(istkbnxepw istkbnxepwVar) {
            return istkbnxepwVar;
        }
    }

    iobyxmoadg() {
    }

    @Override // lm.gxszxtbevo.iobyxmoadg
    public lm.gxszxtbevo ppxfxbqfkf(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, zdlpuopuiu zdlpuopuiuVar) {
        if (istkbnxepw.class.isAssignableFrom(cqumvgiudr.nufgyqmvbu(type))) {
            return zoijcleaow.f63453iobyxmoadg;
        }
        return null;
    }

    @Override // lm.gxszxtbevo.iobyxmoadg
    public lm.gxszxtbevo wkgbmnqykc(Type type, Annotation[] annotationArr, zdlpuopuiu zdlpuopuiuVar) {
        if (type == yadqdtsiqt.class) {
            return cqumvgiudr.draadjrbmk(annotationArr, om.iwizpuwonk.class) ? ppxfxbqfkf.f63451iobyxmoadg : C1294iobyxmoadg.f63450iobyxmoadg;
        }
        if (type == Void.class) {
            return gxszxtbevo.f63449iobyxmoadg;
        }
        if (!this.f63447iobyxmoadg || type != wwaezpbzkn.class) {
            return null;
        }
        try {
            return eablkybsjg.f63448iobyxmoadg;
        } catch (NoClassDefFoundError unused) {
            this.f63447iobyxmoadg = false;
            return null;
        }
    }
}
