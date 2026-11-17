package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractCollection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class yadqdtsiqt {

    private static class iobyxmoadg extends ppxfxbqfkf {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        transient xa.vdvldrhtss f23732lereixgezr;

        iobyxmoadg(Map map, xa.vdvldrhtss vdvldrhtssVar) {
            super(map);
            this.f23732lereixgezr = (xa.vdvldrhtss) xa.draadjrbmk.btonecajqb(vdvldrhtssVar);
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            Object object = objectInputStream.readObject();
            Objects.requireNonNull(object);
            this.f23732lereixgezr = (xa.vdvldrhtss) object;
            Object object2 = objectInputStream.readObject();
            Objects.requireNonNull(object2);
            pkzmftpjix((Map) object2);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.f23732lereixgezr);
            objectOutputStream.writeObject(zynmafqrjb());
        }

        @Override // com.google.common.collect.gxszxtbevo
        Set draadjrbmk() {
            return lmojexxdyd();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.wkgbmnqykc
        /* JADX INFO: renamed from: dsvhmnatus, reason: merged with bridge method [inline-methods] */
        public List istkbnxepw() {
            return (List) this.f23732lereixgezr.get();
        }

        @Override // com.google.common.collect.gxszxtbevo
        Map dxjokdxxww() {
            return yadqdtsiqt();
        }
    }

    static abstract class zoijcleaow extends AbstractCollection {
        zoijcleaow() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            iobyxmoadg().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return iobyxmoadg().lqeggnwhkg(entry.getKey(), entry.getValue());
        }

        abstract istkbnxepw iobyxmoadg();

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return iobyxmoadg().remove(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return iobyxmoadg().size();
        }
    }

    static boolean iobyxmoadg(istkbnxepw istkbnxepwVar, Object obj) {
        if (obj == istkbnxepwVar) {
            return true;
        }
        if (obj instanceof istkbnxepw) {
            return istkbnxepwVar.wkgbmnqykc().equals(((istkbnxepw) obj).wkgbmnqykc());
        }
        return false;
    }

    public static esjtqupxsv zoijcleaow(Map map, xa.vdvldrhtss vdvldrhtssVar) {
        return new iobyxmoadg(map, vdvldrhtssVar);
    }
}
