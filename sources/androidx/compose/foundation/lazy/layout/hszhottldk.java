package androidx.compose.foundation.lazy.layout;

/* JADX INFO: loaded from: classes.dex */
public final class hszhottldk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final androidx.collection.dsvhmnatus f5001iobyxmoadg = androidx.collection.ribwqtqdhb.zoijcleaow();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private ppxfxbqfkf f5002ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private Object f5003zoijcleaow;

    public final ppxfxbqfkf iobyxmoadg(Object obj) {
        ppxfxbqfkf ppxfxbqfkfVar = this.f5002ppxfxbqfkf;
        if (this.f5003zoijcleaow == obj && ppxfxbqfkfVar != null) {
            return ppxfxbqfkfVar;
        }
        androidx.collection.dsvhmnatus dsvhmnatusVar = this.f5001iobyxmoadg;
        Object objEablkybsjg = dsvhmnatusVar.eablkybsjg(obj);
        if (objEablkybsjg == null) {
            objEablkybsjg = new ppxfxbqfkf();
            dsvhmnatusVar.cqumvgiudr(obj, objEablkybsjg);
        }
        ppxfxbqfkf ppxfxbqfkfVar2 = (ppxfxbqfkf) objEablkybsjg;
        this.f5003zoijcleaow = obj;
        this.f5002ppxfxbqfkf = ppxfxbqfkfVar2;
        return ppxfxbqfkfVar2;
    }
}
