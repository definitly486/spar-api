package n5;

/* JADX INFO: loaded from: classes2.dex */
public final class kcexrzcfyt {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final kcexrzcfyt f68812iobyxmoadg = new kcexrzcfyt();

    private kcexrzcfyt() {
    }

    public static final String iobyxmoadg(String hash) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(hash, "hash");
        return "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + hash + "')";
    }
}
