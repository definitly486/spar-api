package opjhrmiecq;

/* JADX INFO: loaded from: classes.dex */
public abstract class n0 {

    static final class iobyxmoadg implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ j0.n f73831zdlpuopuiu;

        iobyxmoadg(j0.n nVar) {
            this.f73831zdlpuopuiu = nVar;
        }

        private static final Object eablkybsjg(androidx.compose.runtime.i1 i1Var) {
            return i1Var.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final x.istkbnxepw gxszxtbevo(k0 k0Var, androidx.compose.ui.layout.draadjrbmk draadjrbmkVar, x.pmvmpeiblj pmvmpeibljVar, w0.zoijcleaow zoijcleaowVar) {
            long jZoijcleaow = k0Var.zoijcleaow();
            final androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVarSflfametgt = pmvmpeibljVar.sflfametgt(w0.zoijcleaow.wkgbmnqykc(zoijcleaowVar.vdvldrhtss(), zg.gtknphoqwx.agtfadlqog((int) (jZoijcleaow >> 32), w0.zoijcleaow.agtfadlqog(zoijcleaowVar.vdvldrhtss()), w0.zoijcleaow.draadjrbmk(zoijcleaowVar.vdvldrhtss())), 0, zg.gtknphoqwx.agtfadlqog((int) (jZoijcleaow & 4294967295L), w0.zoijcleaow.wflxmlrfwp(zoijcleaowVar.vdvldrhtss()), w0.zoijcleaow.gtknphoqwx(zoijcleaowVar.vdvldrhtss())), 0, 10, null));
            return androidx.compose.ui.layout.draadjrbmk.ntlheqmsrt(draadjrbmkVar, kcexrzcfytVarSflfametgt.eslsurpljm(), kcexrzcfytVarSflfametgt.ipoelvxyzq(), null, new tg.draadjrbmk() { // from class: opjhrmiecq.m0
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return n0.iobyxmoadg.lqeggnwhkg(kcexrzcfytVarSflfametgt, (androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg) obj);
                }
            }, 4, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gg.wwaezpbzkn lqeggnwhkg(androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar, androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg iobyxmoadgVar) {
            androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg.cllcsxoeiz(iobyxmoadgVar, kcexrzcfytVar, 0, 0, 0.0f, 4, null);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return ppxfxbqfkf((androidx.compose.ui.wkgbmnqykc) obj, (androidx.compose.runtime.draadjrbmk) obj2, ((Number) obj3).intValue());
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v2 ??, still in use, count: 1, list:
              (r10v2 ?? I:java.lang.Object) from 0x00c8: INVOKE (r13v0 ?? I:androidx.compose.runtime.draadjrbmk), (r10v2 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.draadjrbmk.jyumaefscl(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
            	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
            	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
            	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
            */
        public final androidx.compose.ui.wkgbmnqykc ppxfxbqfkf(
        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v2 ??, still in use, count: 1, list:
              (r10v2 ?? I:java.lang.Object) from 0x00c8: INVOKE (r13v0 ?? I:androidx.compose.runtime.draadjrbmk), (r10v2 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.draadjrbmk.jyumaefscl(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
            	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
            	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
            */
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r12v0 ??
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
            	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            */
    }

    public static final androidx.compose.ui.wkgbmnqykc iobyxmoadg(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, j0.n nVar) {
        return androidx.compose.ui.ppxfxbqfkf.ppxfxbqfkf(wkgbmnqykcVar, null, new iobyxmoadg(nVar), 1, null);
    }
}
