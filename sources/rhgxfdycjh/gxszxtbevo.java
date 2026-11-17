package rhgxfdycjh;

import androidx.compose.runtime.u;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class gxszxtbevo implements lereixgezr, u {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private Object[] f82657cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private rgvfuqvkyq.iobyxmoadg f82658esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private Object f82659iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private String f82660jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final tg.iobyxmoadg f82661lereixgezr = new tg.iobyxmoadg() { // from class: rhgxfdycjh.eablkybsjg
        @Override // tg.iobyxmoadg
        public final Object invoke() {
            return gxszxtbevo.dxjokdxxww(this.f82650zdlpuopuiu);
        }
    };

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private rgvfuqvkyq f82662yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private jyumaefscl f82663zdlpuopuiu;

    public gxszxtbevo(jyumaefscl jyumaefsclVar, rgvfuqvkyq rgvfuqvkyqVar, String str, Object obj, Object[] objArr) {
        this.f82663zdlpuopuiu = jyumaefsclVar;
        this.f82662yggfygwlhe = rgvfuqvkyqVar;
        this.f82660jyumaefscl = str;
        this.f82659iwizpuwonk = obj;
        this.f82657cqumvgiudr = objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object dxjokdxxww(gxszxtbevo gxszxtbevoVar) {
        jyumaefscl jyumaefsclVar = gxszxtbevoVar.f82663zdlpuopuiu;
        Object obj = gxszxtbevoVar.f82659iwizpuwonk;
        if (obj != null) {
            return jyumaefsclVar.iobyxmoadg(gxszxtbevoVar, obj);
        }
        throw new IllegalArgumentException("Value should be initialized");
    }

    private final void lqeggnwhkg() {
        rgvfuqvkyq rgvfuqvkyqVar = this.f82662yggfygwlhe;
        if (this.f82658esjtqupxsv == null) {
            if (rgvfuqvkyqVar != null) {
                wkgbmnqykc.nufgyqmvbu(rgvfuqvkyqVar, this.f82661lereixgezr.invoke());
                this.f82658esjtqupxsv = rgvfuqvkyqVar.zoijcleaow(this.f82660jyumaefscl, this.f82661lereixgezr);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("entry(" + this.f82658esjtqupxsv + ") is not null").toString());
    }

    @Override // androidx.compose.runtime.u
    public void eablkybsjg() {
        rgvfuqvkyq.iobyxmoadg iobyxmoadgVar = this.f82658esjtqupxsv;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.iobyxmoadg();
        }
    }

    public final Object gxszxtbevo(Object[] objArr) {
        if (Arrays.equals(objArr, this.f82657cqumvgiudr)) {
            return this.f82659iwizpuwonk;
        }
        return null;
    }

    @Override // rhgxfdycjh.lereixgezr
    public boolean iobyxmoadg(Object obj) {
        rgvfuqvkyq rgvfuqvkyqVar = this.f82662yggfygwlhe;
        return rgvfuqvkyqVar == null || rgvfuqvkyqVar.iobyxmoadg(obj);
    }

    public final void nufgyqmvbu(jyumaefscl jyumaefsclVar, rgvfuqvkyq rgvfuqvkyqVar, String str, Object obj, Object[] objArr) {
        boolean z13;
        boolean z14 = true;
        if (this.f82662yggfygwlhe != rgvfuqvkyqVar) {
            this.f82662yggfygwlhe = rgvfuqvkyqVar;
            z13 = true;
        } else {
            z13 = false;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f82660jyumaefscl, str)) {
            z14 = z13;
        } else {
            this.f82660jyumaefscl = str;
        }
        this.f82663zdlpuopuiu = jyumaefsclVar;
        this.f82659iwizpuwonk = obj;
        this.f82657cqumvgiudr = objArr;
        rgvfuqvkyq.iobyxmoadg iobyxmoadgVar = this.f82658esjtqupxsv;
        if (iobyxmoadgVar == null || !z14) {
            return;
        }
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.iobyxmoadg();
        }
        this.f82658esjtqupxsv = null;
        lqeggnwhkg();
    }

    @Override // androidx.compose.runtime.u
    public void ppxfxbqfkf() {
        rgvfuqvkyq.iobyxmoadg iobyxmoadgVar = this.f82658esjtqupxsv;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.iobyxmoadg();
        }
    }

    @Override // androidx.compose.runtime.u
    public void zoijcleaow() {
        lqeggnwhkg();
    }
}
