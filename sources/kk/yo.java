package kk;

import android.content.Context;
import android.content.SharedPreferences;
import android.security.keystore.KeyGenParameterSpec;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.stats.CodePackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yo implements gg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final Context f59468iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public int f59469ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public SharedPreferences f59470zoijcleaow;

    public yo(Context applicationContext) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(applicationContext, "applicationContext");
        this.f59468iobyxmoadg = applicationContext;
    }

    @Override // kk.gg
    public final boolean a(String key) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
        SharedPreferences sharedPreferencesA = a();
        if (sharedPreferencesA != null) {
            return sharedPreferencesA.contains(key);
        }
        return false;
    }

    @Override // kk.gg
    public final Object b(String str, String str2) {
        return ef.iobyxmoadg(this, str, str2);
    }

    public final t5.ppxfxbqfkf iobyxmoadg() {
        KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setKeySize(UserVerificationMethods.USER_VERIFY_HANDPRINT).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").setUserAuthenticationRequired(false).build();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(keyGenParameterSpecBuild, "Builder(\n            Mas…lse)\n            .build()");
        t5.ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg = new t5.ppxfxbqfkf.iobyxmoadg(this.f59468iobyxmoadg).zoijcleaow(keyGenParameterSpecBuild).iobyxmoadg();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ppxfxbqfkfVarIobyxmoadg, "Builder(applicationConte…pec)\n            .build()");
        return ppxfxbqfkfVarIobyxmoadg;
    }

    public final void ppxfxbqfkf() {
        Object objWkgbmnqykc;
        this.f59469ppxfxbqfkf++;
        tn block = new tn(this);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(block, "block");
        gg.wwaezpbzkn wwaezpbzknVar = null;
        if (10 == this.f59469ppxfxbqfkf) {
            this.f59470zoijcleaow = null;
        }
        try {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(t5.iobyxmoadg.iobyxmoadg(this.f59468iobyxmoadg, "SPAY_ENCRYPTED_DATA", iobyxmoadg(), t5.iobyxmoadg.ppxfxbqfkf.AES256_SIV, t5.iobyxmoadg.wkgbmnqykc.AES256_GCM));
        } catch (Throwable th2) {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
        if (gg.kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
            zoijcleaow();
        }
        if (gg.kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
            objWkgbmnqykc = null;
        }
        SharedPreferences sharedPreferences = (SharedPreferences) objWkgbmnqykc;
        if (sharedPreferences != null) {
            this.f59470zoijcleaow = sharedPreferences;
            wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
        }
        if (wwaezpbzknVar == null) {
            ppxfxbqfkf();
        }
    }

    public final void zoijcleaow() {
        try {
            this.f59468iobyxmoadg.getSharedPreferences("SPAY_ENCRYPTED_DATA", 0).edit().clear().apply();
        } catch (Exception e13) {
            jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("ENCRYPT SP").iobyxmoadg("Exception on dropSavedData(): " + e13, new Object[0]);
        }
    }

    @Override // kk.gg
    public final void a(String str, String str2) {
        ef.zoijcleaow(this, str, str2);
    }

    @Override // kk.gg
    public final SharedPreferences a() {
        return this.f59470zoijcleaow;
    }
}
