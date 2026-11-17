package rhgxfdycjh;

import androidx.compose.runtime.v0;
import gg.wwaezpbzkn;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final int f82688iobyxmoadg = 36;

    public static final Object eablkybsjg(Object[] objArr, jyumaefscl jyumaefsclVar, tg.iobyxmoadg iobyxmoadgVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.ntlheqmsrt(674689872, i13, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:180)");
        }
        Object objWkgbmnqykc = wkgbmnqykc(Arrays.copyOf(objArr, objArr.length), jyumaefsclVar, null, iobyxmoadgVar, draadjrbmkVar, (i13 & 112) | 384 | ((i13 << 3) & 7168), 0);
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
        }
        return objWkgbmnqykc;
    }

    public static final Object gxszxtbevo(Object[] objArr, tg.iobyxmoadg iobyxmoadgVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1564532345, i13, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:135)");
        }
        Object objWkgbmnqykc = wkgbmnqykc(Arrays.copyOf(objArr, objArr.length), esjtqupxsv.gxszxtbevo(), null, iobyxmoadgVar, draadjrbmkVar, ((i13 << 6) & 7168) | 384, 0);
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
        }
        return objWkgbmnqykc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(gxszxtbevo gxszxtbevoVar, jyumaefscl jyumaefsclVar, rgvfuqvkyq rgvfuqvkyqVar, String str, Object obj, Object[] objArr) {
        gxszxtbevoVar.nufgyqmvbu(jyumaefsclVar, rgvfuqvkyqVar, str, obj, objArr);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nufgyqmvbu(rgvfuqvkyq rgvfuqvkyqVar, Object obj) {
        String strPpxfxbqfkf;
        if (obj == null || rgvfuqvkyqVar.iobyxmoadg(obj)) {
            return;
        }
        if (obj instanceof yzdjzghtvl.wflxmlrfwp) {
            yzdjzghtvl.wflxmlrfwp wflxmlrfwpVar = (yzdjzghtvl.wflxmlrfwp) obj;
            if (wflxmlrfwpVar.eablkybsjg() == v0.dxjokdxxww() || wflxmlrfwpVar.eablkybsjg() == v0.rgvfuqvkyq() || wflxmlrfwpVar.eablkybsjg() == v0.wflxmlrfwp()) {
                strPpxfxbqfkf = "MutableState containing " + wflxmlrfwpVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
            } else {
                strPpxfxbqfkf = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
            }
        } else {
            strPpxfxbqfkf = ppxfxbqfkf(obj);
        }
        throw new IllegalArgumentException(strPpxfxbqfkf);
    }

    public static final String ppxfxbqfkf(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v9 ??, still in use, count: 1, list:
          (r14v9 ?? I:java.lang.Object) from 0x00c8: INVOKE (r13v0 ?? I:androidx.compose.runtime.draadjrbmk), (r14v9 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.draadjrbmk.jyumaefscl(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public static final java.lang.Object wkgbmnqykc(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v9 ??, still in use, count: 1, list:
          (r14v9 ?? I:java.lang.Object) from 0x00c8: INVOKE (r13v0 ?? I:androidx.compose.runtime.draadjrbmk), (r14v9 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.draadjrbmk.jyumaefscl(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r9v0 ??
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
