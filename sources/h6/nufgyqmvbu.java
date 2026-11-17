package h6;

/* JADX INFO: loaded from: classes2.dex */
public final class nufgyqmvbu extends o5.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final nufgyqmvbu f39632ppxfxbqfkf = new nufgyqmvbu();

    private nufgyqmvbu() {
        super(12, 13);
    }

    @Override // o5.zoijcleaow
    public void iobyxmoadg(u5.lqeggnwhkg db3) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(db3, "db");
        db3.lmojexxdyd("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        db3.lmojexxdyd("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
