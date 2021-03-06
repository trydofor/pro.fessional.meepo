package pro.fessional.meepo.eval.num;

import org.jetbrains.annotations.NotNull;
import pro.fessional.meepo.eval.NameEval;

import java.util.Map;

import static pro.fessional.meepo.eval.FunEnv.FUN$MOD;


/**
 * @author trydofor
 * @since 2021-01-02
 */
public class Cal {

    public static final NameEval funMod = new NameEval() {
        @Override
        public @NotNull String[] name() {
            return new String[]{FUN$MOD};
        }

        @Override
        public @NotNull String info() {
            return "根据数字对args长度的余数，取得args余数位置的值";
        }

        @Override
        public Object eval(@NotNull Map<String, Object> ctx, Object obj, Object... arg) {
            return arg[((Number) obj).intValue() % arg.length];
        }
    };

}
