package f9;

import android.content.Context;
import g9.draadjrbmk;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import l8.eablkybsjg;

/* JADX INFO: loaded from: classes2.dex */
public final class iobyxmoadg implements eablkybsjg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final eablkybsjg f33329ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f33330zoijcleaow;

    private iobyxmoadg(int i13, eablkybsjg eablkybsjgVar) {
        this.f33330zoijcleaow = i13;
        this.f33329ppxfxbqfkf = eablkybsjgVar;
    }

    public static eablkybsjg ppxfxbqfkf(Context context) {
        return new iobyxmoadg(context.getResources().getConfiguration().uiMode & 48, zoijcleaow.ppxfxbqfkf(context));
    }

    @Override // l8.eablkybsjg
    public boolean equals(Object obj) {
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return this.f33330zoijcleaow == iobyxmoadgVar.f33330zoijcleaow && this.f33329ppxfxbqfkf.equals(iobyxmoadgVar.f33329ppxfxbqfkf);
    }

    @Override // l8.eablkybsjg
    public int hashCode() {
        return draadjrbmk.ojitshcjhn(this.f33329ppxfxbqfkf, this.f33330zoijcleaow);
    }

    @Override // l8.eablkybsjg
    public void zoijcleaow(MessageDigest messageDigest) {
        this.f33329ppxfxbqfkf.zoijcleaow(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f33330zoijcleaow).array());
    }
}
