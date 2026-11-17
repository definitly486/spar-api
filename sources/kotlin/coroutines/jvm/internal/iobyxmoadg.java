package kotlin.coroutines.jvm.internal;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import java.io.Serializable;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iobyxmoadg implements lg.gxszxtbevo, eablkybsjg, Serializable {
    private final lg.gxszxtbevo<Object> completion;

    public iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
        this.completion = gxszxtbevoVar;
    }

    public lg.gxszxtbevo<wwaezpbzkn> create(lg.gxszxtbevo<?> completion) {
        zdlpuopuiu.btonecajqb(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // kotlin.coroutines.jvm.internal.eablkybsjg
    public eablkybsjg getCallerFrame() {
        lg.gxszxtbevo<Object> gxszxtbevoVar = this.completion;
        if (gxszxtbevoVar instanceof eablkybsjg) {
            return (eablkybsjg) gxszxtbevoVar;
        }
        return null;
    }

    public final lg.gxszxtbevo<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        return lqeggnwhkg.wkgbmnqykc(this);
    }

    protected abstract Object invokeSuspend(Object obj);

    protected void releaseIntercepted() {
    }

    @Override // lg.gxszxtbevo
    public final void resumeWith(Object obj) {
        lg.gxszxtbevo<Object> gxszxtbevoVar = this;
        while (true) {
            nufgyqmvbu.zoijcleaow(gxszxtbevoVar);
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            lg.gxszxtbevo<Object> gxszxtbevoVar2 = iobyxmoadgVar.completion;
            zdlpuopuiu.lqeggnwhkg(gxszxtbevoVar2);
            try {
                Object objInvokeSuspend = iobyxmoadgVar.invokeSuspend(obj);
                if (objInvokeSuspend == mg.zoijcleaow.gxszxtbevo()) {
                    return;
                } else {
                    obj = kcexrzcfyt.wkgbmnqykc(objInvokeSuspend);
                }
            } catch (Throwable th2) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                obj = kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            iobyxmoadgVar.releaseIntercepted();
            if (!(gxszxtbevoVar2 instanceof iobyxmoadg)) {
                gxszxtbevoVar2.resumeWith(obj);
                return;
            }
            gxszxtbevoVar = gxszxtbevoVar2;
        }
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb3.append(stackTraceElement);
        return sb3.toString();
    }

    public lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> completion) {
        zdlpuopuiu.btonecajqb(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
