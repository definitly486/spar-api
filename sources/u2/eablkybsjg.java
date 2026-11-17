package u2;

import androidx.lifecycle.ntlheqmsrt;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public final class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final eablkybsjg f112506iobyxmoadg = new eablkybsjg();

    private eablkybsjg() {
    }

    public final ntlheqmsrt iobyxmoadg(Class modelClass) throws InvocationTargetException {
        zdlpuopuiu.btonecajqb(modelClass, "modelClass");
        try {
            Constructor declaredConstructor = modelClass.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new RuntimeException("Cannot create an instance of " + modelClass);
            }
            try {
                Object objNewInstance = declaredConstructor.newInstance(null);
                zdlpuopuiu.lqeggnwhkg(objNewInstance);
                return (ntlheqmsrt) objNewInstance;
            } catch (IllegalAccessException e13) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e13);
            } catch (InstantiationException e14) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e14);
            }
        } catch (NoSuchMethodException e15) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e15);
        }
    }
}
