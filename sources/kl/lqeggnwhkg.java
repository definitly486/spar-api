package kl;

import java.security.Key;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes3.dex */
public class lqeggnwhkg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final KeyAgreement f59727eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Signature f59728iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Mac f59729ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Key f59730wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Cipher f59731zoijcleaow;

    public lqeggnwhkg(Signature signature) {
        this(signature, null, null, null, null);
    }

    public Cipher iobyxmoadg() {
        return this.f59731zoijcleaow;
    }

    public KeyAgreement ppxfxbqfkf() {
        return this.f59727eablkybsjg;
    }

    public Signature wkgbmnqykc() {
        return this.f59728iobyxmoadg;
    }

    public Key zoijcleaow() {
        return this.f59730wkgbmnqykc;
    }

    public lqeggnwhkg(Cipher cipher) {
        this(null, cipher, null, null, null);
    }

    public lqeggnwhkg(Key key) {
        this(null, null, null, key, null);
    }

    public lqeggnwhkg(KeyAgreement keyAgreement) {
        this(null, null, null, null, keyAgreement);
    }

    private lqeggnwhkg(Signature signature, Cipher cipher, Mac mac, Key key, KeyAgreement keyAgreement) {
        this.f59728iobyxmoadg = signature;
        this.f59731zoijcleaow = cipher;
        this.f59729ppxfxbqfkf = mac;
        this.f59730wkgbmnqykc = key;
        this.f59727eablkybsjg = keyAgreement;
    }
}
