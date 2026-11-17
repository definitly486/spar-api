package bz;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
class hszhottldk extends metgxyhuhe {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Context f17432eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private volatile String f17433gxszxtbevo;

    hszhottldk(Context context) {
        super(kc2.lqeggnwhkg.InstallationSource);
        this.f17432eablkybsjg = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: cdpycssgdh, reason: merged with bridge method [inline-methods] */
    public String lereixgezr() throws jhduphickx {
        if (this.f17433gxszxtbevo == null) {
            this.f17433gxszxtbevo = this.f17432eablkybsjg.getPackageManager().getInstallerPackageName(this.f17432eablkybsjg.getPackageName());
            if (this.f17433gxszxtbevo == null) {
                throw new jhduphickx("pkg == null");
            }
        }
        return this.f17433gxszxtbevo;
    }
}
