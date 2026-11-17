package hk;

import fk.vipkmwdibw;
import kotlin.KotlinNothingValueException;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes3.dex */
abstract class ppxfxbqfkf extends vipkmwdibw implements gk.dxjokdxxww {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f40540eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    protected final gk.lqeggnwhkg f40541gxszxtbevo;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final gk.zoijcleaow f40542ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final gk.btonecajqb f40543wkgbmnqykc;

    public /* synthetic */ ppxfxbqfkf(gk.zoijcleaow zoijcleaowVar, gk.btonecajqb btonecajqbVar, String str, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(zoijcleaowVar, btonecajqbVar, str);
    }

    private final Void dvvnrvtcbc(gk.iozdgvuglv iozdgvuglvVar, String str, String str2) {
        StringBuilder sb3;
        String str3;
        if (mj.kcexrzcfyt.stevsuqkhv(str, "i", false, 2, null)) {
            sb3 = new StringBuilder();
            str3 = "an ";
        } else {
            sb3 = new StringBuilder();
            str3 = "a ";
        }
        sb3.append(str3);
        sb3.append(str);
        throw oxmwwwfdhm.eablkybsjg(-1, "Failed to parse literal '" + iozdgvuglvVar + "' as " + sb3.toString() + " value at element: " + iwxlajgraz(str2), sflfametgt().toString());
    }

    public abstract gk.btonecajqb auzgnhcxok();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fk.ageimvtcrz
    /* JADX INFO: renamed from: bfopjjpdmp, reason: merged with bridge method [inline-methods] */
    public char wypolnanlu(String tag) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tag, "tag");
        gk.btonecajqb btonecajqbVarYdmasvzmpa = ydmasvzmpa(tag);
        if (btonecajqbVarYdmasvzmpa instanceof gk.iozdgvuglv) {
            gk.iozdgvuglv iozdgvuglvVar = (gk.iozdgvuglv) btonecajqbVarYdmasvzmpa;
            try {
                return mj.kcexrzcfyt.w(iozdgvuglvVar.iobyxmoadg());
            } catch (IllegalArgumentException unused) {
                dvvnrvtcbc(iozdgvuglvVar, "char", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw oxmwwwfdhm.eablkybsjg(-1, "Expected " + kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(gk.iozdgvuglv.class).jyumaefscl() + ", but had " + kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(btonecajqbVarYdmasvzmpa.getClass()).jyumaefscl() + " as the serialized body of char at element: " + iwxlajgraz(tag), btonecajqbVarYdmasvzmpa.toString());
    }

    @Override // ek.eablkybsjg
    public boolean cdpycssgdh() {
        return !(sflfametgt() instanceof gk.pmvmpeiblj);
    }

    @Override // fk.ageimvtcrz, ek.eablkybsjg
    public Object eablkybsjg(bk.iobyxmoadg deserializer) {
        gk.iozdgvuglv iozdgvuglvVarBtonecajqb;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(deserializer, "deserializer");
        if (!(deserializer instanceof fk.zoijcleaow) || wkgbmnqykc().eablkybsjg().rgvfuqvkyq()) {
            return deserializer.zoijcleaow(this);
        }
        fk.zoijcleaow zoijcleaowVar = (fk.zoijcleaow) deserializer;
        String strPpxfxbqfkf = istkbnxepw.ppxfxbqfkf(zoijcleaowVar.iobyxmoadg(), wkgbmnqykc());
        gk.btonecajqb btonecajqbVarLqeggnwhkg = lqeggnwhkg();
        String strNufgyqmvbu = zoijcleaowVar.iobyxmoadg().nufgyqmvbu();
        if (btonecajqbVarLqeggnwhkg instanceof gk.cdpycssgdh) {
            gk.cdpycssgdh cdpycssgdhVar = (gk.cdpycssgdh) btonecajqbVarLqeggnwhkg;
            gk.btonecajqb btonecajqbVar = (gk.btonecajqb) cdpycssgdhVar.get(strPpxfxbqfkf);
            try {
                bk.iobyxmoadg iobyxmoadgVarIobyxmoadg = bk.lqeggnwhkg.iobyxmoadg((fk.zoijcleaow) deserializer, this, (btonecajqbVar == null || (iozdgvuglvVarBtonecajqb = gk.gtknphoqwx.btonecajqb(btonecajqbVar)) == null) ? null : gk.gtknphoqwx.gxszxtbevo(iozdgvuglvVarBtonecajqb));
                kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(iobyxmoadgVarIobyxmoadg, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>");
                return jpowsppfya.zoijcleaow(wkgbmnqykc(), strPpxfxbqfkf, cdpycssgdhVar, iobyxmoadgVarIobyxmoadg);
            } catch (SerializationException e13) {
                String message = e13.getMessage();
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(message);
                throw oxmwwwfdhm.eablkybsjg(-1, message, cdpycssgdhVar.toString());
            }
        }
        throw oxmwwwfdhm.eablkybsjg(-1, "Expected " + kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(gk.cdpycssgdh.class).jyumaefscl() + ", but had " + kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(btonecajqbVarLqeggnwhkg.getClass()).jyumaefscl() + " as the serialized body of " + strNufgyqmvbu + " at element: " + czzsidtyhn(), btonecajqbVarLqeggnwhkg.toString());
    }

    @Override // ek.ppxfxbqfkf
    public ik.zoijcleaow iobyxmoadg() {
        return wkgbmnqykc().iobyxmoadg();
    }

    @Override // fk.ageimvtcrz, ek.eablkybsjg
    public ek.eablkybsjg istkbnxepw(dk.gxszxtbevo descriptor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        return jlmebxxoox() != null ? super.istkbnxepw(descriptor) : new jyumaefscl(wkgbmnqykc(), auzgnhcxok(), this.f40540eablkybsjg).istkbnxepw(descriptor);
    }

    public final String iwxlajgraz(String currentTag) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(currentTag, "currentTag");
        return czzsidtyhn() + '.' + currentTag;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fk.ageimvtcrz
    /* JADX INFO: renamed from: iyctptxqzt, reason: merged with bridge method [inline-methods] */
    public int kegysxyocb(String tag, dk.gxszxtbevo enumDescriptor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tag, "tag");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(enumDescriptor, "enumDescriptor");
        gk.zoijcleaow zoijcleaowVarWkgbmnqykc = wkgbmnqykc();
        gk.btonecajqb btonecajqbVarYdmasvzmpa = ydmasvzmpa(tag);
        String strNufgyqmvbu = enumDescriptor.nufgyqmvbu();
        if (btonecajqbVarYdmasvzmpa instanceof gk.iozdgvuglv) {
            return zdlpuopuiu.gtknphoqwx(enumDescriptor, zoijcleaowVarWkgbmnqykc, ((gk.iozdgvuglv) btonecajqbVarYdmasvzmpa).iobyxmoadg(), null, 4, null);
        }
        throw oxmwwwfdhm.eablkybsjg(-1, "Expected " + kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(gk.iozdgvuglv.class).jyumaefscl() + ", but had " + kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(btonecajqbVarYdmasvzmpa.getClass()).jyumaefscl() + " as the serialized body of " + strNufgyqmvbu + " at element: " + iwxlajgraz(tag), btonecajqbVarYdmasvzmpa.toString());
    }

    @Override // fk.vipkmwdibw
    protected String jztzpxfvev(String parentName, String childName) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(parentName, "parentName");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(childName, "childName");
        return childName;
    }

    @Override // gk.dxjokdxxww
    public gk.btonecajqb lqeggnwhkg() {
        return sflfametgt();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fk.ageimvtcrz
    /* JADX INFO: renamed from: lrnfpwlwnk, reason: merged with bridge method [inline-methods] */
    public ek.eablkybsjg mbcevpiqjq(String tag, dk.gxszxtbevo inlineDescriptor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tag, "tag");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(inlineDescriptor, "inlineDescriptor");
        if (!lmojexxdyd.zoijcleaow(inlineDescriptor)) {
            return super.mbcevpiqjq(tag, inlineDescriptor);
        }
        gk.zoijcleaow zoijcleaowVarWkgbmnqykc = wkgbmnqykc();
        gk.btonecajqb btonecajqbVarYdmasvzmpa = ydmasvzmpa(tag);
        String strNufgyqmvbu = inlineDescriptor.nufgyqmvbu();
        if (btonecajqbVarYdmasvzmpa instanceof gk.iozdgvuglv) {
            return new rgvfuqvkyq(ylkuphrtab.iobyxmoadg(zoijcleaowVarWkgbmnqykc, ((gk.iozdgvuglv) btonecajqbVarYdmasvzmpa).iobyxmoadg()), wkgbmnqykc());
        }
        throw oxmwwwfdhm.eablkybsjg(-1, "Expected " + kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(gk.iozdgvuglv.class).jyumaefscl() + ", but had " + kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(btonecajqbVarYdmasvzmpa.getClass()).jyumaefscl() + " as the serialized body of " + strNufgyqmvbu + " at element: " + iwxlajgraz(tag), btonecajqbVarYdmasvzmpa.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fk.ageimvtcrz
    /* JADX INFO: renamed from: nuxfzjnpeb, reason: merged with bridge method [inline-methods] */
    public long ulzqkzuiru(String tag) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tag, "tag");
        gk.btonecajqb btonecajqbVarYdmasvzmpa = ydmasvzmpa(tag);
        if (btonecajqbVarYdmasvzmpa instanceof gk.iozdgvuglv) {
            gk.iozdgvuglv iozdgvuglvVar = (gk.iozdgvuglv) btonecajqbVarYdmasvzmpa;
            try {
                return gk.gtknphoqwx.draadjrbmk(iozdgvuglvVar);
            } catch (IllegalArgumentException unused) {
                dvvnrvtcbc(iozdgvuglvVar, "long", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw oxmwwwfdhm.eablkybsjg(-1, "Expected " + kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(gk.iozdgvuglv.class).jyumaefscl() + ", but had " + kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(btonecajqbVarYdmasvzmpa.getClass()).jyumaefscl() + " as the serialized body of long at element: " + iwxlajgraz(tag), btonecajqbVarYdmasvzmpa.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fk.ageimvtcrz
    /* JADX INFO: renamed from: oipsdeybqn, reason: merged with bridge method [inline-methods] */
    public byte dsvhmnatus(String tag) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tag, "tag");
        gk.btonecajqb btonecajqbVarYdmasvzmpa = ydmasvzmpa(tag);
        if (btonecajqbVarYdmasvzmpa instanceof gk.iozdgvuglv) {
            gk.iozdgvuglv iozdgvuglvVar = (gk.iozdgvuglv) btonecajqbVarYdmasvzmpa;
            try {
                int iDxjokdxxww = gk.gtknphoqwx.dxjokdxxww(iozdgvuglvVar);
                Byte bValueOf = (-128 > iDxjokdxxww || iDxjokdxxww > 127) ? null : Byte.valueOf((byte) iDxjokdxxww);
                if (bValueOf != null) {
                    return bValueOf.byteValue();
                }
                dvvnrvtcbc(iozdgvuglvVar, "byte", tag);
                throw new KotlinNothingValueException();
            } catch (IllegalArgumentException unused) {
                dvvnrvtcbc(iozdgvuglvVar, "byte", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw oxmwwwfdhm.eablkybsjg(-1, "Expected " + kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(gk.iozdgvuglv.class).jyumaefscl() + ", but had " + kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(btonecajqbVarYdmasvzmpa.getClass()).jyumaefscl() + " as the serialized body of byte at element: " + iwxlajgraz(tag), btonecajqbVarYdmasvzmpa.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fk.ageimvtcrz
    /* JADX INFO: renamed from: opjhrmiecq, reason: merged with bridge method [inline-methods] */
    public double stevsuqkhv(String tag) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tag, "tag");
        gk.btonecajqb btonecajqbVarYdmasvzmpa = ydmasvzmpa(tag);
        if (btonecajqbVarYdmasvzmpa instanceof gk.iozdgvuglv) {
            gk.iozdgvuglv iozdgvuglvVar = (gk.iozdgvuglv) btonecajqbVarYdmasvzmpa;
            try {
                double dLqeggnwhkg = gk.gtknphoqwx.lqeggnwhkg(iozdgvuglvVar);
                if (wkgbmnqykc().eablkybsjg().zoijcleaow() || !(Double.isInfinite(dLqeggnwhkg) || Double.isNaN(dLqeggnwhkg))) {
                    return dLqeggnwhkg;
                }
                throw oxmwwwfdhm.iobyxmoadg(Double.valueOf(dLqeggnwhkg), tag, sflfametgt().toString());
            } catch (IllegalArgumentException unused) {
                dvvnrvtcbc(iozdgvuglvVar, "double", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw oxmwwwfdhm.eablkybsjg(-1, "Expected " + kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(gk.iozdgvuglv.class).jyumaefscl() + ", but had " + kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(btonecajqbVarYdmasvzmpa.getClass()).jyumaefscl() + " as the serialized body of double at element: " + iwxlajgraz(tag), btonecajqbVarYdmasvzmpa.toString());
    }

    @Override // ek.eablkybsjg
    public ek.ppxfxbqfkf ppxfxbqfkf(dk.gxszxtbevo descriptor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        gk.btonecajqb btonecajqbVarSflfametgt = sflfametgt();
        dk.agtfadlqog kind = descriptor.getKind();
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(kind, dk.ojitshcjhn.zoijcleaow.f29098iobyxmoadg) || (kind instanceof dk.wkgbmnqykc)) {
            gk.zoijcleaow zoijcleaowVarWkgbmnqykc = wkgbmnqykc();
            String strNufgyqmvbu = descriptor.nufgyqmvbu();
            if (btonecajqbVarSflfametgt instanceof gk.ppxfxbqfkf) {
                return new lereixgezr(zoijcleaowVarWkgbmnqykc, (gk.ppxfxbqfkf) btonecajqbVarSflfametgt);
            }
            throw oxmwwwfdhm.eablkybsjg(-1, "Expected " + kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(gk.ppxfxbqfkf.class).jyumaefscl() + ", but had " + kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(btonecajqbVarSflfametgt.getClass()).jyumaefscl() + " as the serialized body of " + strNufgyqmvbu + " at element: " + czzsidtyhn(), btonecajqbVarSflfametgt.toString());
        }
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(kind, dk.ojitshcjhn.ppxfxbqfkf.f29096iobyxmoadg)) {
            gk.zoijcleaow zoijcleaowVarWkgbmnqykc2 = wkgbmnqykc();
            String strNufgyqmvbu2 = descriptor.nufgyqmvbu();
            if (btonecajqbVarSflfametgt instanceof gk.cdpycssgdh) {
                return new esjtqupxsv(zoijcleaowVarWkgbmnqykc2, (gk.cdpycssgdh) btonecajqbVarSflfametgt, this.f40540eablkybsjg, null, 8, null);
            }
            throw oxmwwwfdhm.eablkybsjg(-1, "Expected " + kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(gk.cdpycssgdh.class).jyumaefscl() + ", but had " + kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(btonecajqbVarSflfametgt.getClass()).jyumaefscl() + " as the serialized body of " + strNufgyqmvbu2 + " at element: " + czzsidtyhn(), btonecajqbVarSflfametgt.toString());
        }
        gk.zoijcleaow zoijcleaowVarWkgbmnqykc3 = wkgbmnqykc();
        dk.gxszxtbevo gxszxtbevoVarIobyxmoadg = cllcsxoeiz.iobyxmoadg(descriptor.lqeggnwhkg(0), zoijcleaowVarWkgbmnqykc3.iobyxmoadg());
        dk.agtfadlqog kind2 = gxszxtbevoVarIobyxmoadg.getKind();
        if ((kind2 instanceof dk.eablkybsjg) || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(kind2, dk.agtfadlqog.zoijcleaow.f29058iobyxmoadg)) {
            gk.zoijcleaow zoijcleaowVarWkgbmnqykc4 = wkgbmnqykc();
            String strNufgyqmvbu3 = descriptor.nufgyqmvbu();
            if (btonecajqbVarSflfametgt instanceof gk.cdpycssgdh) {
                return new pmvmpeiblj(zoijcleaowVarWkgbmnqykc4, (gk.cdpycssgdh) btonecajqbVarSflfametgt);
            }
            throw oxmwwwfdhm.eablkybsjg(-1, "Expected " + kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(gk.cdpycssgdh.class).jyumaefscl() + ", but had " + kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(btonecajqbVarSflfametgt.getClass()).jyumaefscl() + " as the serialized body of " + strNufgyqmvbu3 + " at element: " + czzsidtyhn(), btonecajqbVarSflfametgt.toString());
        }
        if (!zoijcleaowVarWkgbmnqykc3.eablkybsjg().ppxfxbqfkf()) {
            throw oxmwwwfdhm.ppxfxbqfkf(gxszxtbevoVarIobyxmoadg);
        }
        gk.zoijcleaow zoijcleaowVarWkgbmnqykc5 = wkgbmnqykc();
        String strNufgyqmvbu4 = descriptor.nufgyqmvbu();
        if (btonecajqbVarSflfametgt instanceof gk.ppxfxbqfkf) {
            return new lereixgezr(zoijcleaowVarWkgbmnqykc5, (gk.ppxfxbqfkf) btonecajqbVarSflfametgt);
        }
        throw oxmwwwfdhm.eablkybsjg(-1, "Expected " + kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(gk.ppxfxbqfkf.class).jyumaefscl() + ", but had " + kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(btonecajqbVarSflfametgt.getClass()).jyumaefscl() + " as the serialized body of " + strNufgyqmvbu4 + " at element: " + czzsidtyhn(), btonecajqbVarSflfametgt.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fk.ageimvtcrz
    /* JADX INFO: renamed from: roivzttewh, reason: merged with bridge method [inline-methods] */
    public String crxdokpmqz(String tag) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tag, "tag");
        gk.btonecajqb btonecajqbVarYdmasvzmpa = ydmasvzmpa(tag);
        if (!(btonecajqbVarYdmasvzmpa instanceof gk.iozdgvuglv)) {
            throw oxmwwwfdhm.eablkybsjg(-1, "Expected " + kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(gk.iozdgvuglv.class).jyumaefscl() + ", but had " + kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(btonecajqbVarYdmasvzmpa.getClass()).jyumaefscl() + " as the serialized body of string at element: " + iwxlajgraz(tag), btonecajqbVarYdmasvzmpa.toString());
        }
        gk.iozdgvuglv iozdgvuglvVar = (gk.iozdgvuglv) btonecajqbVarYdmasvzmpa;
        if (!(iozdgvuglvVar instanceof gk.iwizpuwonk)) {
            throw oxmwwwfdhm.eablkybsjg(-1, "Expected string value for a non-null key '" + tag + "', got null literal instead at element: " + iwxlajgraz(tag), sflfametgt().toString());
        }
        gk.iwizpuwonk iwizpuwonkVar = (gk.iwizpuwonk) iozdgvuglvVar;
        if (iwizpuwonkVar.ppxfxbqfkf() || wkgbmnqykc().eablkybsjg().vdvldrhtss()) {
            return iwizpuwonkVar.iobyxmoadg();
        }
        throw oxmwwwfdhm.eablkybsjg(-1, "String literal for key '" + tag + "' should be quoted at element: " + iwxlajgraz(tag) + ".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", sflfametgt().toString());
    }

    protected final gk.btonecajqb sflfametgt() {
        gk.btonecajqb btonecajqbVarYdmasvzmpa;
        String str = (String) jlmebxxoox();
        return (str == null || (btonecajqbVarYdmasvzmpa = ydmasvzmpa(str)) == null) ? auzgnhcxok() : btonecajqbVarYdmasvzmpa;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fk.ageimvtcrz
    /* JADX INFO: renamed from: tbqsvytpvh, reason: merged with bridge method [inline-methods] */
    public short sopmlzcsov(String tag) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tag, "tag");
        gk.btonecajqb btonecajqbVarYdmasvzmpa = ydmasvzmpa(tag);
        if (btonecajqbVarYdmasvzmpa instanceof gk.iozdgvuglv) {
            gk.iozdgvuglv iozdgvuglvVar = (gk.iozdgvuglv) btonecajqbVarYdmasvzmpa;
            try {
                int iDxjokdxxww = gk.gtknphoqwx.dxjokdxxww(iozdgvuglvVar);
                Short shValueOf = (-32768 > iDxjokdxxww || iDxjokdxxww > 32767) ? null : Short.valueOf((short) iDxjokdxxww);
                if (shValueOf != null) {
                    return shValueOf.shortValue();
                }
                dvvnrvtcbc(iozdgvuglvVar, "short", tag);
                throw new KotlinNothingValueException();
            } catch (IllegalArgumentException unused) {
                dvvnrvtcbc(iozdgvuglvVar, "short", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw oxmwwwfdhm.eablkybsjg(-1, "Expected " + kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(gk.iozdgvuglv.class).jyumaefscl() + ", but had " + kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(btonecajqbVarYdmasvzmpa.getClass()).jyumaefscl() + " as the serialized body of short at element: " + iwxlajgraz(tag), btonecajqbVarYdmasvzmpa.toString());
    }

    protected final String uawqvzlxes() {
        return this.f40540eablkybsjg;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fk.ageimvtcrz
    /* JADX INFO: renamed from: weqkydbzbr, reason: merged with bridge method [inline-methods] */
    public float tzroggbefp(String tag) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tag, "tag");
        gk.btonecajqb btonecajqbVarYdmasvzmpa = ydmasvzmpa(tag);
        if (btonecajqbVarYdmasvzmpa instanceof gk.iozdgvuglv) {
            gk.iozdgvuglv iozdgvuglvVar = (gk.iozdgvuglv) btonecajqbVarYdmasvzmpa;
            try {
                float fNufgyqmvbu = gk.gtknphoqwx.nufgyqmvbu(iozdgvuglvVar);
                if (wkgbmnqykc().eablkybsjg().zoijcleaow() || !(Float.isInfinite(fNufgyqmvbu) || Float.isNaN(fNufgyqmvbu))) {
                    return fNufgyqmvbu;
                }
                throw oxmwwwfdhm.iobyxmoadg(Float.valueOf(fNufgyqmvbu), tag, sflfametgt().toString());
            } catch (IllegalArgumentException unused) {
                dvvnrvtcbc(iozdgvuglvVar, "float", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw oxmwwwfdhm.eablkybsjg(-1, "Expected " + kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(gk.iozdgvuglv.class).jyumaefscl() + ", but had " + kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(btonecajqbVarYdmasvzmpa.getClass()).jyumaefscl() + " as the serialized body of float at element: " + iwxlajgraz(tag), btonecajqbVarYdmasvzmpa.toString());
    }

    @Override // gk.dxjokdxxww
    public gk.zoijcleaow wkgbmnqykc() {
        return this.f40542ppxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract gk.btonecajqb ydmasvzmpa(String str);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fk.ageimvtcrz
    /* JADX INFO: renamed from: zeieaojujs, reason: merged with bridge method [inline-methods] */
    public int ntlheqmsrt(String tag) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tag, "tag");
        gk.btonecajqb btonecajqbVarYdmasvzmpa = ydmasvzmpa(tag);
        if (btonecajqbVarYdmasvzmpa instanceof gk.iozdgvuglv) {
            gk.iozdgvuglv iozdgvuglvVar = (gk.iozdgvuglv) btonecajqbVarYdmasvzmpa;
            try {
                return gk.gtknphoqwx.dxjokdxxww(iozdgvuglvVar);
            } catch (IllegalArgumentException unused) {
                dvvnrvtcbc(iozdgvuglvVar, "int", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw oxmwwwfdhm.eablkybsjg(-1, "Expected " + kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(gk.iozdgvuglv.class).jyumaefscl() + ", but had " + kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(btonecajqbVarYdmasvzmpa.getClass()).jyumaefscl() + " as the serialized body of int at element: " + iwxlajgraz(tag), btonecajqbVarYdmasvzmpa.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fk.ageimvtcrz
    /* JADX INFO: renamed from: zfvoamnweg, reason: merged with bridge method [inline-methods] */
    public boolean cllcsxoeiz(String tag) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tag, "tag");
        gk.btonecajqb btonecajqbVarYdmasvzmpa = ydmasvzmpa(tag);
        if (btonecajqbVarYdmasvzmpa instanceof gk.iozdgvuglv) {
            gk.iozdgvuglv iozdgvuglvVar = (gk.iozdgvuglv) btonecajqbVarYdmasvzmpa;
            try {
                Boolean boolEablkybsjg = gk.gtknphoqwx.eablkybsjg(iozdgvuglvVar);
                if (boolEablkybsjg != null) {
                    return boolEablkybsjg.booleanValue();
                }
                dvvnrvtcbc(iozdgvuglvVar, "boolean", tag);
                throw new KotlinNothingValueException();
            } catch (IllegalArgumentException unused) {
                dvvnrvtcbc(iozdgvuglvVar, "boolean", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw oxmwwwfdhm.eablkybsjg(-1, "Expected " + kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(gk.iozdgvuglv.class).jyumaefscl() + ", but had " + kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(btonecajqbVarYdmasvzmpa.getClass()).jyumaefscl() + " as the serialized body of boolean at element: " + iwxlajgraz(tag), btonecajqbVarYdmasvzmpa.toString());
    }

    public void zoijcleaow(dk.gxszxtbevo descriptor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
    }

    public /* synthetic */ ppxfxbqfkf(gk.zoijcleaow zoijcleaowVar, gk.btonecajqb btonecajqbVar, String str, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(zoijcleaowVar, btonecajqbVar, (i13 & 4) != 0 ? null : str, null);
    }

    private ppxfxbqfkf(gk.zoijcleaow zoijcleaowVar, gk.btonecajqb btonecajqbVar, String str) {
        this.f40542ppxfxbqfkf = zoijcleaowVar;
        this.f40543wkgbmnqykc = btonecajqbVar;
        this.f40540eablkybsjg = str;
        this.f40541gxszxtbevo = wkgbmnqykc().eablkybsjg();
    }
}
