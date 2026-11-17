package com.google.firebase.abt.component;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import tc.zoijcleaow;

/* JADX INFO: loaded from: classes2.dex */
public class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f24187iobyxmoadg = new HashMap();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final zoijcleaow f24188ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Context f24189zoijcleaow;

    protected iobyxmoadg(Context context, zoijcleaow zoijcleaowVar) {
        this.f24189zoijcleaow = context;
        this.f24188ppxfxbqfkf = zoijcleaowVar;
    }

    protected qb.zoijcleaow iobyxmoadg(String str) {
        return new qb.zoijcleaow(this.f24189zoijcleaow, this.f24188ppxfxbqfkf, str);
    }

    public synchronized qb.zoijcleaow zoijcleaow(String str) {
        try {
            if (!this.f24187iobyxmoadg.containsKey(str)) {
                this.f24187iobyxmoadg.put(str, iobyxmoadg(str));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (qb.zoijcleaow) this.f24187iobyxmoadg.get(str);
    }
}
