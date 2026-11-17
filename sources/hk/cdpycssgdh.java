package hk;

/* JADX INFO: loaded from: classes3.dex */
public final class cdpycssgdh implements ik.wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f40485iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f40486zoijcleaow;

    public cdpycssgdh(boolean z13, String discriminator) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(discriminator, "discriminator");
        this.f40485iobyxmoadg = z13;
        this.f40486zoijcleaow = discriminator;
    }

    private final void eablkybsjg(dk.gxszxtbevo gxszxtbevoVar, ah.wkgbmnqykc wkgbmnqykcVar) {
        dk.agtfadlqog kind = gxszxtbevoVar.getKind();
        if ((kind instanceof dk.wkgbmnqykc) || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(kind, dk.agtfadlqog.iobyxmoadg.f29057iobyxmoadg)) {
            throw new IllegalArgumentException("Serializer for " + wkgbmnqykcVar.jyumaefscl() + " can't be registered as a subclass for polymorphic serialization because its kind " + kind + " is not concrete. To work with multiple hierarchies, register it as a base class.");
        }
        if (this.f40485iobyxmoadg) {
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(kind, dk.ojitshcjhn.zoijcleaow.f29098iobyxmoadg) || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(kind, dk.ojitshcjhn.ppxfxbqfkf.f29096iobyxmoadg) || (kind instanceof dk.eablkybsjg) || (kind instanceof dk.agtfadlqog.zoijcleaow)) {
            throw new IllegalArgumentException("Serializer for " + wkgbmnqykcVar.jyumaefscl() + " of kind " + kind + " cannot be serialized polymorphically with class discriminator.");
        }
    }

    private final void wkgbmnqykc(dk.gxszxtbevo gxszxtbevoVar, ah.wkgbmnqykc wkgbmnqykcVar) {
        int iWkgbmnqykc = gxszxtbevoVar.wkgbmnqykc();
        for (int i13 = 0; i13 < iWkgbmnqykc; i13++) {
            String strEablkybsjg = gxszxtbevoVar.eablkybsjg(i13);
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(strEablkybsjg, this.f40486zoijcleaow)) {
                throw new IllegalArgumentException("Polymorphic serializer for " + wkgbmnqykcVar + " has property '" + strEablkybsjg + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            }
        }
    }

    @Override // ik.wkgbmnqykc
    public void iobyxmoadg(ah.wkgbmnqykc baseClass, tg.draadjrbmk defaultSerializerProvider) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(baseClass, "baseClass");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(defaultSerializerProvider, "defaultSerializerProvider");
    }

    @Override // ik.wkgbmnqykc
    public void ppxfxbqfkf(ah.wkgbmnqykc baseClass, ah.wkgbmnqykc actualClass, bk.zoijcleaow actualSerializer) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(baseClass, "baseClass");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(actualClass, "actualClass");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(actualSerializer, "actualSerializer");
        dk.gxszxtbevo gxszxtbevoVarIobyxmoadg = actualSerializer.iobyxmoadg();
        eablkybsjg(gxszxtbevoVarIobyxmoadg, actualClass);
        if (this.f40485iobyxmoadg) {
            return;
        }
        wkgbmnqykc(gxszxtbevoVarIobyxmoadg, actualClass);
    }

    @Override // ik.wkgbmnqykc
    public void zoijcleaow(ah.wkgbmnqykc baseClass, tg.draadjrbmk defaultDeserializerProvider) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(baseClass, "baseClass");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(defaultDeserializerProvider, "defaultDeserializerProvider");
    }
}
