package pj;

/* JADX INFO: loaded from: classes3.dex */
public class iwxlajgraz extends lxfrhoxuzk implements pmvmpeiblj {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final boolean f76726jyumaefscl;

    public iwxlajgraz(auzgnhcxok auzgnhcxokVar) {
        super(true);
        bfopjjpdmp(auzgnhcxokVar);
        this.f76726jyumaefscl = yzdjzghtvl();
    }

    private final boolean yzdjzghtvl() {
        lxfrhoxuzk lxfrhoxuzkVarYggfygwlhe;
        yggfygwlhe yggfygwlheVarUwvvkdfqfp = uwvvkdfqfp();
        jyumaefscl jyumaefsclVar = yggfygwlheVarUwvvkdfqfp instanceof jyumaefscl ? (jyumaefscl) yggfygwlheVarUwvvkdfqfp : null;
        if (jyumaefsclVar != null && (lxfrhoxuzkVarYggfygwlhe = jyumaefsclVar.yggfygwlhe()) != null) {
            while (!lxfrhoxuzkVarYggfygwlhe.jztzpxfvev()) {
                yggfygwlhe yggfygwlheVarUwvvkdfqfp2 = lxfrhoxuzkVarYggfygwlhe.uwvvkdfqfp();
                jyumaefscl jyumaefsclVar2 = yggfygwlheVarUwvvkdfqfp2 instanceof jyumaefscl ? (jyumaefscl) yggfygwlheVarUwvvkdfqfp2 : null;
                if (jyumaefsclVar2 == null || (lxfrhoxuzkVarYggfygwlhe = jyumaefsclVar2.yggfygwlhe()) == null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // pj.lxfrhoxuzk
    public boolean jztzpxfvev() {
        return this.f76726jyumaefscl;
    }

    @Override // pj.pmvmpeiblj
    public boolean wkgbmnqykc(Throwable th2) {
        return nuxfzjnpeb(new istkbnxepw(th2, false, 2, null));
    }

    @Override // pj.lxfrhoxuzk
    public boolean xrmfcynszj() {
        return true;
    }
}
