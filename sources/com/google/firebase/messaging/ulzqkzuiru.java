package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class ulzqkzuiru {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Executor f24486eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final SharedPreferences f24488iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f24489ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f24491zoijcleaow;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    final ArrayDeque f24490wkgbmnqykc = new ArrayDeque();

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private boolean f24487gxszxtbevo = false;

    private ulzqkzuiru(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f24488iobyxmoadg = sharedPreferences;
        this.f24491zoijcleaow = str;
        this.f24489ppxfxbqfkf = str2;
        this.f24486eablkybsjg = executor;
    }

    private void dxjokdxxww() {
        this.f24486eablkybsjg.execute(new Runnable() { // from class: com.google.firebase.messaging.ntlheqmsrt
            @Override // java.lang.Runnable
            public final void run() {
                this.f24458zdlpuopuiu.nufgyqmvbu();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nufgyqmvbu() {
        synchronized (this.f24490wkgbmnqykc) {
            this.f24488iobyxmoadg.edit().putString(this.f24491zoijcleaow, lqeggnwhkg()).commit();
        }
    }

    static ulzqkzuiru ppxfxbqfkf(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        ulzqkzuiru ulzqkzuiruVar = new ulzqkzuiru(sharedPreferences, str, str2, executor);
        ulzqkzuiruVar.wkgbmnqykc();
        return ulzqkzuiruVar;
    }

    private void wkgbmnqykc() {
        synchronized (this.f24490wkgbmnqykc) {
            try {
                this.f24490wkgbmnqykc.clear();
                String string = this.f24488iobyxmoadg.getString(this.f24491zoijcleaow, "");
                if (!TextUtils.isEmpty(string) && string.contains(this.f24489ppxfxbqfkf)) {
                    String[] strArrSplit = string.split(this.f24489ppxfxbqfkf, -1);
                    if (strArrSplit.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            this.f24490wkgbmnqykc.add(str);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private boolean zoijcleaow(boolean z13) {
        if (z13 && !this.f24487gxszxtbevo) {
            dxjokdxxww();
        }
        return z13;
    }

    public String eablkybsjg() {
        String str;
        synchronized (this.f24490wkgbmnqykc) {
            str = (String) this.f24490wkgbmnqykc.peek();
        }
        return str;
    }

    public boolean gxszxtbevo(Object obj) {
        boolean zZoijcleaow;
        synchronized (this.f24490wkgbmnqykc) {
            zZoijcleaow = zoijcleaow(this.f24490wkgbmnqykc.remove(obj));
        }
        return zZoijcleaow;
    }

    public String lqeggnwhkg() {
        StringBuilder sb3 = new StringBuilder();
        Iterator it = this.f24490wkgbmnqykc.iterator();
        while (it.hasNext()) {
            sb3.append((String) it.next());
            sb3.append(this.f24489ppxfxbqfkf);
        }
        return sb3.toString();
    }
}
