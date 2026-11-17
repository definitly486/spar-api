package com.google.crypto.tink.internal;

import bb.esjtqupxsv;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class oxmwwwfdhm {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f23851iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Map f23852ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Map f23853wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Map f23854zoijcleaow;

    private static class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Class f23855iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final pb.iobyxmoadg f23856zoijcleaow;

        public boolean equals(Object obj) {
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return ppxfxbqfkfVar.f23855iobyxmoadg.equals(this.f23855iobyxmoadg) && ppxfxbqfkfVar.f23856zoijcleaow.equals(this.f23856zoijcleaow);
        }

        public int hashCode() {
            return Objects.hash(this.f23855iobyxmoadg, this.f23856zoijcleaow);
        }

        public String toString() {
            return this.f23855iobyxmoadg.getSimpleName() + ", object identifier: " + this.f23856zoijcleaow;
        }

        private ppxfxbqfkf(Class cls, pb.iobyxmoadg iobyxmoadgVar) {
            this.f23855iobyxmoadg = cls;
            this.f23856zoijcleaow = iobyxmoadgVar;
        }
    }

    private static class wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Class f23857iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Class f23858zoijcleaow;

        public boolean equals(Object obj) {
            if (!(obj instanceof wkgbmnqykc)) {
                return false;
            }
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
            return wkgbmnqykcVar.f23857iobyxmoadg.equals(this.f23857iobyxmoadg) && wkgbmnqykcVar.f23858zoijcleaow.equals(this.f23858zoijcleaow);
        }

        public int hashCode() {
            return Objects.hash(this.f23857iobyxmoadg, this.f23858zoijcleaow);
        }

        public String toString() {
            return this.f23857iobyxmoadg.getSimpleName() + " with serialization type: " + this.f23858zoijcleaow.getSimpleName();
        }

        private wkgbmnqykc(Class cls, Class cls2) {
            this.f23857iobyxmoadg = cls;
            this.f23858zoijcleaow = cls2;
        }
    }

    public boolean eablkybsjg(vdvldrhtss vdvldrhtssVar) {
        return this.f23854zoijcleaow.containsKey(new ppxfxbqfkf(vdvldrhtssVar.getClass(), vdvldrhtssVar.iobyxmoadg()));
    }

    public bb.lqeggnwhkg gxszxtbevo(vdvldrhtss vdvldrhtssVar, esjtqupxsv esjtqupxsvVar) throws GeneralSecurityException {
        ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(vdvldrhtssVar.getClass(), vdvldrhtssVar.iobyxmoadg());
        if (this.f23854zoijcleaow.containsKey(ppxfxbqfkfVar)) {
            return ((com.google.crypto.tink.internal.zoijcleaow) this.f23854zoijcleaow.get(ppxfxbqfkfVar)).wkgbmnqykc(vdvldrhtssVar, esjtqupxsvVar);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + ppxfxbqfkfVar + " available");
    }

    private oxmwwwfdhm(zoijcleaow zoijcleaowVar) {
        this.f23851iobyxmoadg = new HashMap(zoijcleaowVar.f23859iobyxmoadg);
        this.f23854zoijcleaow = new HashMap(zoijcleaowVar.f23862zoijcleaow);
        this.f23852ppxfxbqfkf = new HashMap(zoijcleaowVar.f23860ppxfxbqfkf);
        this.f23853wkgbmnqykc = new HashMap(zoijcleaowVar.f23861wkgbmnqykc);
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Map f23859iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final Map f23860ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final Map f23861wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Map f23862zoijcleaow;

        public zoijcleaow() {
            this.f23859iobyxmoadg = new HashMap();
            this.f23862zoijcleaow = new HashMap();
            this.f23860ppxfxbqfkf = new HashMap();
            this.f23861wkgbmnqykc = new HashMap();
        }

        public zoijcleaow dxjokdxxww(gtknphoqwx gtknphoqwxVar) throws GeneralSecurityException {
            wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(gtknphoqwxVar.zoijcleaow(), gtknphoqwxVar.ppxfxbqfkf());
            if (this.f23860ppxfxbqfkf.containsKey(wkgbmnqykcVar)) {
                gtknphoqwx gtknphoqwxVar2 = (gtknphoqwx) this.f23860ppxfxbqfkf.get(wkgbmnqykcVar);
                if (!gtknphoqwxVar2.equals(gtknphoqwxVar) || !gtknphoqwxVar.equals(gtknphoqwxVar2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + wkgbmnqykcVar);
                }
            } else {
                this.f23860ppxfxbqfkf.put(wkgbmnqykcVar, gtknphoqwxVar);
            }
            return this;
        }

        oxmwwwfdhm eablkybsjg() {
            return new oxmwwwfdhm(this);
        }

        public zoijcleaow gxszxtbevo(com.google.crypto.tink.internal.zoijcleaow zoijcleaowVar) throws GeneralSecurityException {
            ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(zoijcleaowVar.ppxfxbqfkf(), zoijcleaowVar.zoijcleaow());
            if (this.f23862zoijcleaow.containsKey(ppxfxbqfkfVar)) {
                com.google.crypto.tink.internal.zoijcleaow zoijcleaowVar2 = (com.google.crypto.tink.internal.zoijcleaow) this.f23862zoijcleaow.get(ppxfxbqfkfVar);
                if (!zoijcleaowVar2.equals(zoijcleaowVar) || !zoijcleaowVar.equals(zoijcleaowVar2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + ppxfxbqfkfVar);
                }
            } else {
                this.f23862zoijcleaow.put(ppxfxbqfkfVar, zoijcleaowVar);
            }
            return this;
        }

        public zoijcleaow lqeggnwhkg(com.google.crypto.tink.internal.ppxfxbqfkf ppxfxbqfkfVar) throws GeneralSecurityException {
            wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(ppxfxbqfkfVar.zoijcleaow(), ppxfxbqfkfVar.ppxfxbqfkf());
            if (this.f23859iobyxmoadg.containsKey(wkgbmnqykcVar)) {
                com.google.crypto.tink.internal.ppxfxbqfkf ppxfxbqfkfVar2 = (com.google.crypto.tink.internal.ppxfxbqfkf) this.f23859iobyxmoadg.get(wkgbmnqykcVar);
                if (!ppxfxbqfkfVar2.equals(ppxfxbqfkfVar) || !ppxfxbqfkfVar.equals(ppxfxbqfkfVar2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + wkgbmnqykcVar);
                }
            } else {
                this.f23859iobyxmoadg.put(wkgbmnqykcVar, ppxfxbqfkfVar);
            }
            return this;
        }

        public zoijcleaow nufgyqmvbu(btonecajqb btonecajqbVar) throws GeneralSecurityException {
            ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(btonecajqbVar.ppxfxbqfkf(), btonecajqbVar.zoijcleaow());
            if (this.f23861wkgbmnqykc.containsKey(ppxfxbqfkfVar)) {
                btonecajqb btonecajqbVar2 = (btonecajqb) this.f23861wkgbmnqykc.get(ppxfxbqfkfVar);
                if (!btonecajqbVar2.equals(btonecajqbVar) || !btonecajqbVar.equals(btonecajqbVar2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + ppxfxbqfkfVar);
                }
            } else {
                this.f23861wkgbmnqykc.put(ppxfxbqfkfVar, btonecajqbVar);
            }
            return this;
        }

        public zoijcleaow(oxmwwwfdhm oxmwwwfdhmVar) {
            this.f23859iobyxmoadg = new HashMap(oxmwwwfdhmVar.f23851iobyxmoadg);
            this.f23862zoijcleaow = new HashMap(oxmwwwfdhmVar.f23854zoijcleaow);
            this.f23860ppxfxbqfkf = new HashMap(oxmwwwfdhmVar.f23852ppxfxbqfkf);
            this.f23861wkgbmnqykc = new HashMap(oxmwwwfdhmVar.f23853wkgbmnqykc);
        }
    }
}
