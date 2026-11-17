package com.google.crypto.tink.internal;

import bb.iwizpuwonk;
import bb.jyumaefscl;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class agtfadlqog {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f23817iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Map f23818zoijcleaow;

    private static final class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Class f23819iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Class f23820zoijcleaow;

        public boolean equals(Object obj) {
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return ppxfxbqfkfVar.f23819iobyxmoadg.equals(this.f23819iobyxmoadg) && ppxfxbqfkfVar.f23820zoijcleaow.equals(this.f23820zoijcleaow);
        }

        public int hashCode() {
            return Objects.hash(this.f23819iobyxmoadg, this.f23820zoijcleaow);
        }

        public String toString() {
            return this.f23819iobyxmoadg.getSimpleName() + " with primitive type: " + this.f23820zoijcleaow.getSimpleName();
        }

        private ppxfxbqfkf(Class cls, Class cls2) {
            this.f23819iobyxmoadg = cls;
            this.f23820zoijcleaow = cls2;
        }
    }

    public Object eablkybsjg(jyumaefscl jyumaefsclVar, Class cls) throws GeneralSecurityException {
        if (!this.f23818zoijcleaow.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for " + cls);
        }
        iwizpuwonk iwizpuwonkVar = (iwizpuwonk) this.f23818zoijcleaow.get(cls);
        if (jyumaefsclVar.lqeggnwhkg().equals(iwizpuwonkVar.zoijcleaow()) && iwizpuwonkVar.zoijcleaow().equals(jyumaefsclVar.lqeggnwhkg())) {
            return iwizpuwonkVar.iobyxmoadg(jyumaefsclVar);
        }
        throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
    }

    public Class ppxfxbqfkf(Class cls) throws GeneralSecurityException {
        if (this.f23818zoijcleaow.containsKey(cls)) {
            return ((iwizpuwonk) this.f23818zoijcleaow.get(cls)).zoijcleaow();
        }
        throw new GeneralSecurityException("No input primitive class for " + cls + " available");
    }

    public Object wkgbmnqykc(bb.lqeggnwhkg lqeggnwhkgVar, Class cls) throws GeneralSecurityException {
        ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(lqeggnwhkgVar.getClass(), cls);
        if (this.f23817iobyxmoadg.containsKey(ppxfxbqfkfVar)) {
            return ((draadjrbmk) this.f23817iobyxmoadg.get(ppxfxbqfkfVar)).iobyxmoadg(lqeggnwhkgVar);
        }
        throw new GeneralSecurityException("No PrimitiveConstructor for " + ppxfxbqfkfVar + " available");
    }

    private agtfadlqog(zoijcleaow zoijcleaowVar) {
        this.f23817iobyxmoadg = new HashMap(zoijcleaowVar.f23821iobyxmoadg);
        this.f23818zoijcleaow = new HashMap(zoijcleaowVar.f23822zoijcleaow);
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Map f23821iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Map f23822zoijcleaow;

        public zoijcleaow() {
            this.f23821iobyxmoadg = new HashMap();
            this.f23822zoijcleaow = new HashMap();
        }

        public zoijcleaow eablkybsjg(iwizpuwonk iwizpuwonkVar) throws GeneralSecurityException {
            if (iwizpuwonkVar == null) {
                throw new NullPointerException("wrapper must be non-null");
            }
            Class clsPpxfxbqfkf = iwizpuwonkVar.ppxfxbqfkf();
            if (this.f23822zoijcleaow.containsKey(clsPpxfxbqfkf)) {
                iwizpuwonk iwizpuwonkVar2 = (iwizpuwonk) this.f23822zoijcleaow.get(clsPpxfxbqfkf);
                if (!iwizpuwonkVar2.equals(iwizpuwonkVar) || !iwizpuwonkVar.equals(iwizpuwonkVar2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type" + clsPpxfxbqfkf);
                }
            } else {
                this.f23822zoijcleaow.put(clsPpxfxbqfkf, iwizpuwonkVar);
            }
            return this;
        }

        agtfadlqog ppxfxbqfkf() {
            return new agtfadlqog(this);
        }

        public zoijcleaow wkgbmnqykc(draadjrbmk draadjrbmkVar) throws GeneralSecurityException {
            if (draadjrbmkVar == null) {
                throw new NullPointerException("primitive constructor must be non-null");
            }
            ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(draadjrbmkVar.ppxfxbqfkf(), draadjrbmkVar.wkgbmnqykc());
            if (this.f23821iobyxmoadg.containsKey(ppxfxbqfkfVar)) {
                draadjrbmk draadjrbmkVar2 = (draadjrbmk) this.f23821iobyxmoadg.get(ppxfxbqfkfVar);
                if (!draadjrbmkVar2.equals(draadjrbmkVar) || !draadjrbmkVar.equals(draadjrbmkVar2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + ppxfxbqfkfVar);
                }
            } else {
                this.f23821iobyxmoadg.put(ppxfxbqfkfVar, draadjrbmkVar);
            }
            return this;
        }

        public zoijcleaow(agtfadlqog agtfadlqogVar) {
            this.f23821iobyxmoadg = new HashMap(agtfadlqogVar.f23817iobyxmoadg);
            this.f23822zoijcleaow = new HashMap(agtfadlqogVar.f23818zoijcleaow);
        }
    }
}
