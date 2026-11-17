package androidx.datastore.preferences.protobuf;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class iobyxmoadg implements wwaezpbzkn {
    protected int memoizedHashCode = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static abstract class AbstractC0140iobyxmoadg implements wwaezpbzkn.iobyxmoadg {
        protected static UninitializedMessageException gxszxtbevo(wwaezpbzkn wwaezpbzknVar) {
            return new UninitializedMessageException(wwaezpbzknVar);
        }

        private static void ppxfxbqfkf(Iterable iterable, List list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (Object obj : iterable) {
                if (obj == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(obj);
            }
        }

        protected static void zoijcleaow(Iterable iterable, List list) {
            zdlpuopuiu.iobyxmoadg(iterable);
            if (!(iterable instanceof cqumvgiudr)) {
                if (iterable instanceof stevsuqkhv) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    ppxfxbqfkf(iterable, list);
                    return;
                }
            }
            List underlyingElements = ((cqumvgiudr) iterable).getUnderlyingElements();
            cqumvgiudr cqumvgiudrVar = (cqumvgiudr) list;
            int size = list.size();
            for (Object obj : underlyingElements) {
                if (obj == null) {
                    String str = "Element at index " + (cqumvgiudrVar.size() - size) + " is null.";
                    for (int size2 = cqumvgiudrVar.size() - 1; size2 >= size; size2--) {
                        cqumvgiudrVar.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof gxszxtbevo) {
                    cqumvgiudrVar.r((gxszxtbevo) obj);
                } else {
                    cqumvgiudrVar.add((String) obj);
                }
            }
        }

        @Override // androidx.datastore.preferences.protobuf.wwaezpbzkn.iobyxmoadg
        /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
        public AbstractC0140iobyxmoadg wwaezpbzkn(wwaezpbzkn wwaezpbzknVar) {
            if (getDefaultInstanceForType().getClass().isInstance(wwaezpbzknVar)) {
                return wkgbmnqykc((iobyxmoadg) wwaezpbzknVar);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }

        protected abstract AbstractC0140iobyxmoadg wkgbmnqykc(iobyxmoadg iobyxmoadgVar);
    }

    protected static void zoijcleaow(Iterable iterable, List list) {
        AbstractC0140iobyxmoadg.zoijcleaow(iterable, list);
    }

    UninitializedMessageException eablkybsjg() {
        return new UninitializedMessageException(this);
    }

    abstract void gxszxtbevo(int i13);

    public void lqeggnwhkg(OutputStream outputStream) {
        CodedOutputStream codedOutputStreamRibwqtqdhb = CodedOutputStream.ribwqtqdhb(outputStream, CodedOutputStream.istkbnxepw(getSerializedSize()));
        iobyxmoadg(codedOutputStreamRibwqtqdhb);
        codedOutputStreamRibwqtqdhb.sopmlzcsov();
    }

    abstract int ppxfxbqfkf();

    int wkgbmnqykc(sopmlzcsov sopmlzcsovVar) {
        int iPpxfxbqfkf = ppxfxbqfkf();
        if (iPpxfxbqfkf != -1) {
            return iPpxfxbqfkf;
        }
        int serializedSize = sopmlzcsovVar.getSerializedSize(this);
        gxszxtbevo(serializedSize);
        return serializedSize;
    }
}
