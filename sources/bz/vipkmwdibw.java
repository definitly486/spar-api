package bz;

import android.accounts.AccountManager;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class vipkmwdibw extends metgxyhuhe {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Context f17656eablkybsjg;

    vipkmwdibw(Context context) {
        super(kc2.lqeggnwhkg.GoogleID);
        this.f17656eablkybsjg = context;
    }

    private boolean yadqdtsiqt(String str) {
        return androidx.core.content.iobyxmoadg.checkSelfPermission(this.f17656eablkybsjg, str) == 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: cdpycssgdh, reason: merged with bridge method [inline-methods] */
    public String lereixgezr() throws jrbgnlbqoe, q2 {
        try {
            return AccountManager.get(this.f17656eablkybsjg).getAccountsByType("com.google")[0].name;
        } catch (Throwable th2) {
            if (!yadqdtsiqt("android.permission.READ_CONTACTS")) {
                throw new q2(t6.ppxfxbqfkf.READ_CONTACTS);
            }
            if (yadqdtsiqt("android.permission.GET_ACCOUNTS")) {
                throw new jrbgnlbqoe(th2.toString());
            }
            throw new q2(t6.ppxfxbqfkf.GET_ACCOUNTS);
        }
    }
}
