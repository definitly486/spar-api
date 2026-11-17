package zi;

import com.google.protobuf.DescriptorProtos;
import io.appmetrica.analytics.impl.C4007z9;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ageimvtcrz {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final ikoacuggdj f129994iobyxmoadg = bj.draadjrbmk.wkgbmnqykc(bj.gtknphoqwx.f16436crxdokpmqz, new String[0]);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final ikoacuggdj f129997zoijcleaow = bj.draadjrbmk.wkgbmnqykc(bj.gtknphoqwx.f16493stevsuqkhv, new String[0]);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final ikoacuggdj f129995ppxfxbqfkf = new iobyxmoadg("NO_EXPECTED_TYPE");

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final ikoacuggdj f129996wkgbmnqykc = new iobyxmoadg("UNIT_EXPECTED_TYPE");

    public static class iobyxmoadg extends pmvmpeiblj {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final String f129998yggfygwlhe;

        public iobyxmoadg(String str) {
            this.f129998yggfygwlhe = str;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0030  */
        private static /* synthetic */ void c(int i13) {
            String str = (i13 == 1 || i13 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i13 == 1 || i13 == 4) ? 2 : 3];
            if (i13 == 1) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
            } else if (i13 == 2) {
                objArr[0] = "delegate";
            } else if (i13 == 3) {
                objArr[0] = "kotlinTypeRefiner";
            } else if (i13 != 4) {
                objArr[0] = "newAttributes";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
            }
            if (i13 == 1) {
                objArr[1] = "toString";
            } else if (i13 != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
            } else {
                objArr[1] = "refine";
            }
            if (i13 != 1) {
                if (i13 == 2) {
                    objArr[2] = "replaceDelegate";
                } else if (i13 == 3) {
                    objArr[2] = "refine";
                } else if (i13 != 4) {
                    objArr[2] = "replaceAttributes";
                }
            }
            String str2 = String.format(str, objArr);
            if (i13 != 1 && i13 != 4) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        @Override // zi.pmvmpeiblj
        public pmvmpeiblj b(ikoacuggdj ikoacuggdjVar) {
            if (ikoacuggdjVar == null) {
                c(2);
            }
            throw new IllegalStateException(this.f129998yggfygwlhe);
        }

        @Override // zi.pmvmpeiblj, zi.kegysxyocb
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public iobyxmoadg ixidwrxhsl(aj.lqeggnwhkg lqeggnwhkgVar) {
            if (lqeggnwhkgVar == null) {
                c(3);
            }
            return this;
        }

        @Override // zi.grlcpdaxtj
        /* JADX INFO: renamed from: eslsurpljm, reason: merged with bridge method [inline-methods] */
        public ikoacuggdj rhgxfdycjh(opjhrmiecq opjhrmiecqVar) {
            if (opjhrmiecqVar == null) {
                c(0);
            }
            throw new IllegalStateException(this.f129998yggfygwlhe);
        }

        @Override // zi.pmvmpeiblj
        protected ikoacuggdj krqnebusok() {
            throw new IllegalStateException(this.f129998yggfygwlhe);
        }

        @Override // zi.ikoacuggdj
        public String toString() {
            String str = this.f129998yggfygwlhe;
            if (str == null) {
                c(1);
            }
            return str;
        }

        @Override // zi.grlcpdaxtj
        /* JADX INFO: renamed from: yzdjzghtvl, reason: merged with bridge method [inline-methods] */
        public ikoacuggdj fmlbqenlif(boolean z13) {
            throw new IllegalStateException(this.f129998yggfygwlhe);
        }
    }

    public static kegysxyocb agtfadlqog(kegysxyocb kegysxyocbVar) {
        if (kegysxyocbVar == null) {
            iobyxmoadg(2);
        }
        return rgvfuqvkyq(kegysxyocbVar, false);
    }

    public static boolean btonecajqb(kegysxyocb kegysxyocbVar) {
        if (kegysxyocbVar == null) {
            iobyxmoadg(29);
        }
        if (kegysxyocbVar.grlcpdaxtj().ylkuphrtab() instanceof jh.eablkybsjg) {
            return false;
        }
        Iterator it = nufgyqmvbu(kegysxyocbVar).iterator();
        while (it.hasNext()) {
            if (draadjrbmk((kegysxyocb) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean draadjrbmk(kegysxyocb kegysxyocbVar) {
        if (kegysxyocbVar == null) {
            iobyxmoadg(27);
        }
        if (kegysxyocbVar.mhtqkkgtqm()) {
            return true;
        }
        if (jpowsppfya.zoijcleaow(kegysxyocbVar) && draadjrbmk(jpowsppfya.iobyxmoadg(kegysxyocbVar).krqnebusok())) {
            return true;
        }
        if (metgxyhuhe.ppxfxbqfkf(kegysxyocbVar)) {
            return false;
        }
        if (wflxmlrfwp(kegysxyocbVar)) {
            return btonecajqb(kegysxyocbVar);
        }
        zeieaojujs zeieaojujsVarGrlcpdaxtj = kegysxyocbVar.grlcpdaxtj();
        if (zeieaojujsVarGrlcpdaxtj instanceof stevsuqkhv) {
            Iterator it = zeieaojujsVarGrlcpdaxtj.zoijcleaow().iterator();
            while (it.hasNext()) {
                if (draadjrbmk((kegysxyocb) it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static jh.yfnezrywwk dxjokdxxww(kegysxyocb kegysxyocbVar) {
        if (kegysxyocbVar == null) {
            iobyxmoadg(63);
        }
        if (kegysxyocbVar.grlcpdaxtj().ylkuphrtab() instanceof jh.yfnezrywwk) {
            return (jh.yfnezrywwk) kegysxyocbVar.grlcpdaxtj().ylkuphrtab();
        }
        return null;
    }

    public static kegysxyocb eablkybsjg(kegysxyocb kegysxyocbVar, kegysxyocb kegysxyocbVar2, wizcaqwiak wizcaqwiakVar) {
        if (kegysxyocbVar == null) {
            iobyxmoadg(20);
        }
        if (kegysxyocbVar2 == null) {
            iobyxmoadg(21);
        }
        if (wizcaqwiakVar == null) {
            iobyxmoadg(22);
        }
        kegysxyocb kegysxyocbVarRgvfuqvkyq = wizcaqwiakVar.rgvfuqvkyq(kegysxyocbVar2, mhtqkkgtqm.INVARIANT);
        if (kegysxyocbVarRgvfuqvkyq != null) {
            return vdvldrhtss(kegysxyocbVarRgvfuqvkyq, kegysxyocbVar.mhtqkkgtqm());
        }
        return null;
    }

    public static boolean gtknphoqwx(kegysxyocb kegysxyocbVar) {
        return kegysxyocbVar != null && kegysxyocbVar.grlcpdaxtj() == f129994iobyxmoadg.grlcpdaxtj();
    }

    public static jh.eablkybsjg gxszxtbevo(kegysxyocb kegysxyocbVar) {
        if (kegysxyocbVar == null) {
            iobyxmoadg(30);
        }
        jh.nufgyqmvbu nufgyqmvbuVarWkgbmnqykc = kegysxyocbVar.grlcpdaxtj().ylkuphrtab();
        if (nufgyqmvbuVarWkgbmnqykc instanceof jh.eablkybsjg) {
            return (jh.eablkybsjg) nufgyqmvbuVarWkgbmnqykc;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:75:0x0105  */
    /* JADX WARN: Code duplicated, block: B:82:0x011c  */
    private static /* synthetic */ void iobyxmoadg(int i13) {
        String str;
        int i14;
        if (i13 != 4 && i13 != 9 && i13 != 11 && i13 != 15 && i13 != 17 && i13 != 19 && i13 != 26 && i13 != 35 && i13 != 48 && i13 != 53 && i13 != 6 && i13 != 7) {
            switch (i13) {
                case 56:
                case 57:
                case 58:
                case 59:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i13 != 4 && i13 != 9 && i13 != 11 && i13 != 15 && i13 != 17 && i13 != 19 && i13 != 26 && i13 != 35 && i13 != 48 && i13 != 53 && i13 != 6 && i13 != 7) {
            switch (i13) {
                case 56:
                case 57:
                case 58:
                case 59:
                    i14 = 2;
                    break;
                default:
                    i14 = 3;
                    break;
            }
        } else {
            i14 = 2;
        }
        Object[] objArr = new Object[i14];
        switch (i13) {
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
            case 19:
            case C4007z9.G /* 26 */:
            case C4007z9.J /* 35 */:
            case 48:
            case 53:
            case 56:
            case 57:
            case 58:
            case 59:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                break;
            case 5:
            case 8:
            case 10:
            case 18:
            case 23:
            case C4007z9.F /* 25 */:
            case 27:
            case 28:
            case C4007z9.I /* 29 */:
            case 30:
            case C4007z9.K /* 38 */:
            case 40:
            default:
                objArr[0] = "type";
                break;
            case 12:
                objArr[0] = "typeConstructor";
                break;
            case 13:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 14:
                objArr[0] = "refinedTypeFactory";
                break;
            case 16:
                objArr[0] = "parameters";
                break;
            case 20:
                objArr[0] = "subType";
                break;
            case 21:
                objArr[0] = "superType";
                break;
            case 22:
                objArr[0] = "substitutor";
                break;
            case 24:
                objArr[0] = "result";
                break;
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
            case 33:
                objArr[0] = "clazz";
                break;
            case 32:
                objArr[0] = "typeArguments";
                break;
            case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                objArr[0] = "projections";
                break;
            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                objArr[0] = "a";
                break;
            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                objArr[0] = "b";
                break;
            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                objArr[0] = "typeParameters";
                break;
            case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                objArr[0] = "typeParameterConstructors";
                break;
            case 42:
                objArr[0] = "specialType";
                break;
            case 43:
            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                objArr[0] = "isSpecialType";
                break;
            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
            case 46:
                objArr[0] = "parameterDescriptor";
                break;
            case 47:
            case 51:
                objArr[0] = "numberValueTypeConstructor";
                break;
            case 49:
            case 50:
                objArr[0] = "supertypes";
                break;
            case 52:
            case 55:
                objArr[0] = "expectedType";
                break;
            case 54:
                objArr[0] = "literalTypeConstructor";
                break;
        }
        if (i13 == 4) {
            objArr[1] = "makeNullableAsSpecified";
        } else if (i13 == 9) {
            objArr[1] = "makeNullableIfNeeded";
        } else if (i13 == 11 || i13 == 15) {
            objArr[1] = "makeUnsubstitutedType";
        } else if (i13 == 17) {
            objArr[1] = "getDefaultTypeProjections";
        } else if (i13 == 19) {
            objArr[1] = "getImmediateSupertypes";
        } else if (i13 == 26) {
            objArr[1] = "getAllSupertypes";
        } else if (i13 == 35) {
            objArr[1] = "substituteProjectionsForParameters";
        } else if (i13 == 48) {
            objArr[1] = "getDefaultPrimitiveNumberType";
        } else if (i13 != 53) {
            if (i13 != 6 && i13 != 7) {
                switch (i13) {
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        objArr[1] = "getPrimitiveNumberType";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                        break;
                }
            } else {
                objArr[1] = "makeNullableIfNeeded";
            }
        } else {
            objArr[1] = "getPrimitiveNumberType";
        }
        switch (i13) {
            case 1:
                objArr[2] = "makeNullable";
                break;
            case 2:
                objArr[2] = "makeNotNullable";
                break;
            case 3:
                objArr[2] = "makeNullableAsSpecified";
                break;
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
            case 19:
            case C4007z9.G /* 26 */:
            case C4007z9.J /* 35 */:
            case 48:
            case 53:
            case 56:
            case 57:
            case 58:
            case 59:
                break;
            case 5:
            case 8:
                objArr[2] = "makeNullableIfNeeded";
                break;
            case 10:
                objArr[2] = "canHaveSubtypes";
                break;
            case 12:
            case 13:
            case 14:
                objArr[2] = "makeUnsubstitutedType";
                break;
            case 16:
                objArr[2] = "getDefaultTypeProjections";
                break;
            case 18:
                objArr[2] = "getImmediateSupertypes";
                break;
            case 20:
            case 21:
            case 22:
                objArr[2] = "createSubstitutedSupertype";
                break;
            case 23:
            case 24:
                objArr[2] = "collectAllSupertypes";
                break;
            case C4007z9.F /* 25 */:
                objArr[2] = "getAllSupertypes";
                break;
            case 27:
                objArr[2] = "isNullableType";
                break;
            case 28:
                objArr[2] = "acceptsNullable";
                break;
            case C4007z9.I /* 29 */:
                objArr[2] = "hasNullableSuperType";
                break;
            case 30:
                objArr[2] = "getClassDescriptor";
                break;
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
            case 32:
                objArr[2] = "substituteParameters";
                break;
            case 33:
            case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                objArr[2] = "substituteProjectionsForParameters";
                break;
            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                objArr[2] = "equalTypes";
                break;
            case C4007z9.K /* 38 */:
            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                objArr[2] = "dependsOnTypeParameters";
                break;
            case 40:
            case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                objArr[2] = "dependsOnTypeConstructors";
                break;
            case 42:
            case 43:
            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                objArr[2] = "contains";
                break;
            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
            case 46:
                objArr[2] = "makeStarProjection";
                break;
            case 47:
            case 49:
                objArr[2] = "getDefaultPrimitiveNumberType";
                break;
            case 50:
                objArr[2] = "findByFqName";
                break;
            case 51:
            case 52:
            case 54:
            case 55:
                objArr[2] = "getPrimitiveNumberType";
                break;
            case 60:
                objArr[2] = "isTypeParameter";
                break;
            case 61:
                objArr[2] = "isReifiedTypeParameter";
                break;
            case 62:
                objArr[2] = "isNonReifiedTypeParameter";
                break;
            case 63:
                objArr[2] = "getTypeParameterDescriptorOrNull";
                break;
            default:
                objArr[2] = "noExpectedType";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i13 != 4 && i13 != 9 && i13 != 11 && i13 != 15 && i13 != 17 && i13 != 19 && i13 != 26 && i13 != 35 && i13 != 48 && i13 != 53 && i13 != 6 && i13 != 7) {
            switch (i13) {
                case 56:
                case 57:
                case 58:
                case 59:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    public static boolean iwizpuwonk(kegysxyocb kegysxyocbVar) {
        if (kegysxyocbVar == null) {
            iobyxmoadg(0);
        }
        return kegysxyocbVar == f129995ppxfxbqfkf || kegysxyocbVar == f129996wkgbmnqykc;
    }

    public static ikoacuggdj jyumaefscl(zeieaojujs zeieaojujsVar, si.gtknphoqwx gtknphoqwxVar, tg.draadjrbmk draadjrbmkVar) {
        if (zeieaojujsVar == null) {
            iobyxmoadg(12);
        }
        if (gtknphoqwxVar == null) {
            iobyxmoadg(13);
        }
        if (draadjrbmkVar == null) {
            iobyxmoadg(14);
        }
        ikoacuggdj ikoacuggdjVarAgtfadlqog = ntlheqmsrt.agtfadlqog(opjhrmiecq.f130109yggfygwlhe.btonecajqb(), zeieaojujsVar, lqeggnwhkg(zeieaojujsVar.getParameters()), false, gtknphoqwxVar, draadjrbmkVar);
        if (ikoacuggdjVarAgtfadlqog == null) {
            iobyxmoadg(15);
        }
        return ikoacuggdjVarAgtfadlqog;
    }

    public static iwxlajgraz kcexrzcfyt(jh.yfnezrywwk yfnezrywwkVar) {
        if (yfnezrywwkVar == null) {
            iobyxmoadg(45);
        }
        return new uwvvkdfqfp(yfnezrywwkVar);
    }

    public static List lqeggnwhkg(List list) {
        if (list == null) {
            iobyxmoadg(16);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new skhdrjzrfn(((jh.yfnezrywwk) it.next()).ojitshcjhn()));
        }
        List listM = hg.jyumaefscl.m(arrayList);
        if (listM == null) {
            iobyxmoadg(17);
        }
        return listM;
    }

    public static List nufgyqmvbu(kegysxyocb kegysxyocbVar) {
        if (kegysxyocbVar == null) {
            iobyxmoadg(18);
        }
        wizcaqwiak wizcaqwiakVarGxszxtbevo = wizcaqwiak.gxszxtbevo(kegysxyocbVar);
        Collection collectionZoijcleaow = kegysxyocbVar.grlcpdaxtj().zoijcleaow();
        ArrayList arrayList = new ArrayList(collectionZoijcleaow.size());
        Iterator it = collectionZoijcleaow.iterator();
        while (it.hasNext()) {
            kegysxyocb kegysxyocbVarEablkybsjg = eablkybsjg(kegysxyocbVar, (kegysxyocb) it.next(), wizcaqwiakVarGxszxtbevo);
            if (kegysxyocbVarEablkybsjg != null) {
                arrayList.add(kegysxyocbVarEablkybsjg);
            }
        }
        return arrayList;
    }

    public static kegysxyocb ojitshcjhn(kegysxyocb kegysxyocbVar) {
        if (kegysxyocbVar == null) {
            iobyxmoadg(1);
        }
        return rgvfuqvkyq(kegysxyocbVar, true);
    }

    public static ikoacuggdj oxmwwwfdhm(ikoacuggdj ikoacuggdjVar, boolean z13) {
        if (ikoacuggdjVar == null) {
            iobyxmoadg(5);
        }
        if (!z13) {
            if (ikoacuggdjVar == null) {
                iobyxmoadg(7);
            }
            return ikoacuggdjVar;
        }
        ikoacuggdj ikoacuggdjVarFmlbqenlif = ikoacuggdjVar.fmlbqenlif(true);
        if (ikoacuggdjVarFmlbqenlif == null) {
            iobyxmoadg(6);
        }
        return ikoacuggdjVarFmlbqenlif;
    }

    public static boolean ppxfxbqfkf(kegysxyocb kegysxyocbVar, tg.draadjrbmk draadjrbmkVar) {
        if (draadjrbmkVar == null) {
            iobyxmoadg(43);
        }
        return wkgbmnqykc(kegysxyocbVar, draadjrbmkVar, null);
    }

    public static kegysxyocb rgvfuqvkyq(kegysxyocb kegysxyocbVar, boolean z13) {
        if (kegysxyocbVar == null) {
            iobyxmoadg(3);
        }
        grlcpdaxtj grlcpdaxtjVarFmlbqenlif = kegysxyocbVar.jrbgnlbqoe().fmlbqenlif(z13);
        if (grlcpdaxtjVarFmlbqenlif == null) {
            iobyxmoadg(4);
        }
        return grlcpdaxtjVarFmlbqenlif;
    }

    public static kegysxyocb vdvldrhtss(kegysxyocb kegysxyocbVar, boolean z13) {
        if (kegysxyocbVar == null) {
            iobyxmoadg(8);
        }
        if (z13) {
            return ojitshcjhn(kegysxyocbVar);
        }
        if (kegysxyocbVar == null) {
            iobyxmoadg(9);
        }
        return kegysxyocbVar;
    }

    public static boolean wflxmlrfwp(kegysxyocb kegysxyocbVar) {
        if (kegysxyocbVar == null) {
            iobyxmoadg(60);
        }
        if (dxjokdxxww(kegysxyocbVar) != null) {
            return true;
        }
        kegysxyocbVar.grlcpdaxtj();
        return false;
    }

    private static boolean wkgbmnqykc(kegysxyocb kegysxyocbVar, tg.draadjrbmk draadjrbmkVar, jj.draadjrbmk draadjrbmkVar2) {
        if (draadjrbmkVar == null) {
            iobyxmoadg(44);
        }
        if (kegysxyocbVar == null) {
            return false;
        }
        grlcpdaxtj grlcpdaxtjVarJrbgnlbqoe = kegysxyocbVar.jrbgnlbqoe();
        if (iwizpuwonk(kegysxyocbVar)) {
            return ((Boolean) draadjrbmkVar.invoke(grlcpdaxtjVarJrbgnlbqoe)).booleanValue();
        }
        if (draadjrbmkVar2 != null && draadjrbmkVar2.contains(kegysxyocbVar)) {
            return false;
        }
        if (((Boolean) draadjrbmkVar.invoke(grlcpdaxtjVarJrbgnlbqoe)).booleanValue()) {
            return true;
        }
        if (draadjrbmkVar2 == null) {
            draadjrbmkVar2 = jj.draadjrbmk.wkgbmnqykc();
        }
        draadjrbmkVar2.add(kegysxyocbVar);
        ylkuphrtab ylkuphrtabVar = grlcpdaxtjVarJrbgnlbqoe instanceof ylkuphrtab ? (ylkuphrtab) grlcpdaxtjVarJrbgnlbqoe : null;
        if (ylkuphrtabVar != null && (wkgbmnqykc(ylkuphrtabVar.eslsurpljm(), draadjrbmkVar, draadjrbmkVar2) || wkgbmnqykc(ylkuphrtabVar.krqnebusok(), draadjrbmkVar, draadjrbmkVar2))) {
            return true;
        }
        if ((grlcpdaxtjVarJrbgnlbqoe instanceof esjtqupxsv) && wkgbmnqykc(((esjtqupxsv) grlcpdaxtjVarJrbgnlbqoe).c(), draadjrbmkVar, draadjrbmkVar2)) {
            return true;
        }
        zeieaojujs zeieaojujsVarGrlcpdaxtj = kegysxyocbVar.grlcpdaxtj();
        if (zeieaojujsVarGrlcpdaxtj instanceof stevsuqkhv) {
            Iterator it = ((stevsuqkhv) zeieaojujsVarGrlcpdaxtj).zoijcleaow().iterator();
            while (it.hasNext()) {
                if (wkgbmnqykc((kegysxyocb) it.next(), draadjrbmkVar, draadjrbmkVar2)) {
                    return true;
                }
            }
            return false;
        }
        for (iwxlajgraz iwxlajgrazVar : kegysxyocbVar.fyldjkxazc()) {
            if (!iwxlajgrazVar.zoijcleaow() && wkgbmnqykc(iwxlajgrazVar.getType(), draadjrbmkVar, draadjrbmkVar2)) {
                return true;
            }
        }
        return false;
    }

    public static ikoacuggdj yggfygwlhe(jh.nufgyqmvbu nufgyqmvbuVar, si.gtknphoqwx gtknphoqwxVar, tg.draadjrbmk draadjrbmkVar) {
        if (!bj.draadjrbmk.wflxmlrfwp(nufgyqmvbuVar)) {
            return jyumaefscl(nufgyqmvbuVar.btonecajqb(), gtknphoqwxVar, draadjrbmkVar);
        }
        bj.dxjokdxxww dxjokdxxwwVarWkgbmnqykc = bj.draadjrbmk.wkgbmnqykc(bj.gtknphoqwx.f16492sopmlzcsov, nufgyqmvbuVar.toString());
        if (dxjokdxxwwVarWkgbmnqykc == null) {
            iobyxmoadg(11);
        }
        return dxjokdxxwwVarWkgbmnqykc;
    }

    public static iwxlajgraz zdlpuopuiu(jh.yfnezrywwk yfnezrywwkVar, lmojexxdyd lmojexxdydVar) {
        if (yfnezrywwkVar == null) {
            iobyxmoadg(46);
        }
        return lmojexxdydVar.zoijcleaow() == fiwbwshyhd.SUPERTYPE ? new skhdrjzrfn(yfnezrywwk.zoijcleaow(yfnezrywwkVar)) : new uwvvkdfqfp(yfnezrywwkVar);
    }

    public static boolean zoijcleaow(kegysxyocb kegysxyocbVar) {
        if (kegysxyocbVar == null) {
            iobyxmoadg(28);
        }
        if (kegysxyocbVar.mhtqkkgtqm()) {
            return true;
        }
        return jpowsppfya.zoijcleaow(kegysxyocbVar) && zoijcleaow(jpowsppfya.iobyxmoadg(kegysxyocbVar).krqnebusok());
    }
}
