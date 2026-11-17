package com.google.gson;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes2.dex */
public abstract class nufgyqmvbu {
    public boolean btonecajqb() {
        return this instanceof dxjokdxxww;
    }

    public boolean draadjrbmk() {
        return this instanceof gtknphoqwx;
    }

    public boolean dxjokdxxww() {
        return this instanceof eablkybsjg;
    }

    public long eablkybsjg() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean gtknphoqwx() {
        return this instanceof btonecajqb;
    }

    public String gxszxtbevo() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean iobyxmoadg() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public btonecajqb ppxfxbqfkf() {
        if (gtknphoqwx()) {
            return (btonecajqb) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            ce.ppxfxbqfkf ppxfxbqfkfVar = new ce.ppxfxbqfkf(stringWriter);
            ppxfxbqfkfVar.wwaezpbzkn(true);
            com.google.gson.internal.draadjrbmk.zoijcleaow(this, ppxfxbqfkfVar);
            return stringWriter.toString();
        } catch (IOException e13) {
            throw new AssertionError(e13);
        }
    }

    public gtknphoqwx wkgbmnqykc() {
        if (draadjrbmk()) {
            return (gtknphoqwx) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public eablkybsjg zoijcleaow() {
        if (dxjokdxxww()) {
            return (eablkybsjg) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }
}
