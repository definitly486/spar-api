package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f20625iobyxmoadg;

    static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Map f20626iobyxmoadg = new HashMap();

        iobyxmoadg() {
        }

        eablkybsjg zoijcleaow() {
            return new eablkybsjg(this);
        }
    }

    eablkybsjg(iobyxmoadg iobyxmoadgVar) {
        this.f20625iobyxmoadg = Collections.unmodifiableMap(new HashMap(iobyxmoadgVar.f20626iobyxmoadg));
    }

    public boolean iobyxmoadg(Class cls) {
        return this.f20625iobyxmoadg.containsKey(cls);
    }
}
