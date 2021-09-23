package eu.benschroeder.assertj;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.AbstractBigDecimalAssert;
import org.assertj.core.api.AbstractBigIntegerAssert;
import org.assertj.core.api.AbstractBooleanArrayAssert;
import org.assertj.core.api.AbstractBooleanAssert;
import org.assertj.core.api.AbstractByteArrayAssert;
import org.assertj.core.api.AbstractByteAssert;
import org.assertj.core.api.AbstractCharArrayAssert;
import org.assertj.core.api.AbstractCharSequenceAssert;
import org.assertj.core.api.AbstractCharacterAssert;
import org.assertj.core.api.AbstractCollectionAssert;
import org.assertj.core.api.AbstractComparableAssert;
import org.assertj.core.api.AbstractDateAssert;
import org.assertj.core.api.AbstractDoubleArrayAssert;
import org.assertj.core.api.AbstractDoubleAssert;
import org.assertj.core.api.AbstractDurationAssert;
import org.assertj.core.api.AbstractFileAssert;
import org.assertj.core.api.AbstractFloatArrayAssert;
import org.assertj.core.api.AbstractFloatAssert;
import org.assertj.core.api.AbstractInputStreamAssert;
import org.assertj.core.api.AbstractInstantAssert;
import org.assertj.core.api.AbstractIntArrayAssert;
import org.assertj.core.api.AbstractIntegerAssert;
import org.assertj.core.api.AbstractLocalDateAssert;
import org.assertj.core.api.AbstractLocalDateTimeAssert;
import org.assertj.core.api.AbstractLocalTimeAssert;
import org.assertj.core.api.AbstractLongArrayAssert;
import org.assertj.core.api.AbstractLongAssert;
import org.assertj.core.api.AbstractOffsetDateTimeAssert;
import org.assertj.core.api.AbstractOffsetTimeAssert;
import org.assertj.core.api.AbstractPathAssert;
import org.assertj.core.api.AbstractPeriodAssert;
import org.assertj.core.api.AbstractShortArrayAssert;
import org.assertj.core.api.AbstractShortAssert;
import org.assertj.core.api.AbstractStringAssert;
import org.assertj.core.api.AbstractThrowableAssert;
import org.assertj.core.api.AbstractUriAssert;
import org.assertj.core.api.AbstractUrlAssert;
import org.assertj.core.api.AbstractZonedDateTimeAssert;
import org.assertj.core.api.AssertDelegateTarget;
import org.assertj.core.api.AssertFactory;
import org.assertj.core.api.AssertProvider;
import org.assertj.core.api.AtomicBooleanAssert;
import org.assertj.core.api.AtomicIntegerArrayAssert;
import org.assertj.core.api.AtomicIntegerAssert;
import org.assertj.core.api.AtomicIntegerFieldUpdaterAssert;
import org.assertj.core.api.AtomicLongArrayAssert;
import org.assertj.core.api.AtomicLongAssert;
import org.assertj.core.api.AtomicLongFieldUpdaterAssert;
import org.assertj.core.api.AtomicMarkableReferenceAssert;
import org.assertj.core.api.AtomicReferenceArrayAssert;
import org.assertj.core.api.AtomicReferenceAssert;
import org.assertj.core.api.AtomicReferenceFieldUpdaterAssert;
import org.assertj.core.api.AtomicStampedReferenceAssert;
import org.assertj.core.api.BDDAssertions;
import org.assertj.core.api.Boolean2DArrayAssert;
import org.assertj.core.api.Byte2DArrayAssert;
import org.assertj.core.api.Char2DArrayAssert;
import org.assertj.core.api.ClassAssert;
import org.assertj.core.api.ClassBasedNavigableIterableAssert;
import org.assertj.core.api.ClassBasedNavigableListAssert;
import org.assertj.core.api.CompletableFutureAssert;
import org.assertj.core.api.Double2DArrayAssert;
import org.assertj.core.api.DoublePredicateAssert;
import org.assertj.core.api.FactoryBasedNavigableIterableAssert;
import org.assertj.core.api.FactoryBasedNavigableListAssert;
import org.assertj.core.api.Float2DArrayAssert;
import org.assertj.core.api.FutureAssert;
import org.assertj.core.api.Int2DArrayAssert;
import org.assertj.core.api.IntPredicateAssert;
import org.assertj.core.api.IterableAssert;
import org.assertj.core.api.IteratorAssert;
import org.assertj.core.api.ListAssert;
import org.assertj.core.api.Long2DArrayAssert;
import org.assertj.core.api.LongAdderAssert;
import org.assertj.core.api.LongPredicateAssert;
import org.assertj.core.api.MapAssert;
import org.assertj.core.api.NotThrownAssert;
import org.assertj.core.api.Object2DArrayAssert;
import org.assertj.core.api.ObjectArrayAssert;
import org.assertj.core.api.ObjectAssert;
import org.assertj.core.api.OptionalAssert;
import org.assertj.core.api.OptionalDoubleAssert;
import org.assertj.core.api.OptionalIntAssert;
import org.assertj.core.api.OptionalLongAssert;
import org.assertj.core.api.PredicateAssert;
import org.assertj.core.api.Short2DArrayAssert;
import org.assertj.core.api.SpliteratorAssert;
import org.assertj.core.api.ThrowableAssert;
import org.assertj.core.api.ThrowableTypeAssert;
import org.assertj.core.util.CanIgnoreReturnValue;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.net.URL;
import java.nio.file.Path;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.Period;
import java.time.ZonedDateTime;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.Spliterator;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.atomic.AtomicStampedReference;
import java.util.concurrent.atomic.LongAdder;
import java.util.function.Consumer;
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.function.Predicate;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * AssertJ {@link BDDAssertions} as an interface to use in test classes.
 * <p>
 * Inspired by https://blog.javabien.net/2014/04/23/what-if-assertj-used-java-8/
 *
 * @author Benjamin Schröder
 */
public interface WithBDDAssertionsForMockito {

    /**
     * @see BDDAssertions#then(Predicate)
     */
    default <T> PredicateAssert<T> thenAssert(final Predicate<T> actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(IntPredicate)
     */
    default IntPredicateAssert thenAssert(final IntPredicate actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(LongPredicate)
     */
    default LongPredicateAssert thenAssert(final LongPredicate actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(DoublePredicate)
     */
    default DoublePredicateAssert thenAssert(final DoublePredicate actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(Optional)
     */
    default <VALUE> OptionalAssert<VALUE> thenAssert(final Optional<VALUE> optional) {
        return BDDAssertions.then(optional);
    }

    /**
     * @see BDDAssertions#then(OptionalInt)
     */
    default OptionalIntAssert thenAssert(final OptionalInt optional) {
        return BDDAssertions.then(optional);
    }

    /**
     * @see BDDAssertions#then(OptionalLong)
     */
    default OptionalLongAssert thenAssert(final OptionalLong optional) {
        return BDDAssertions.then(optional);
    }

    /**
     * @see BDDAssertions#then(OptionalDouble)
     */
    default OptionalDoubleAssert thenAssert(final OptionalDouble optional) {
        return BDDAssertions.then(optional);
    }

    /**
     * @see BDDAssertions#then(BigDecimal)
     */
    default AbstractBigDecimalAssert<?> thenAssert(final BigDecimal actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(BigInteger)
     */
    default AbstractBigIntegerAssert<?> thenAssert(final BigInteger actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(boolean)
     */
    default AbstractBooleanAssert<?> thenAssert(final boolean actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(Boolean)
     */
    default AbstractBooleanAssert<?> thenAssert(final Boolean actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(boolean[])
     */
    default AbstractBooleanArrayAssert<?> thenAssert(final boolean[] actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(boolean[][])
     */
    default Boolean2DArrayAssert thenAssert(final boolean[][] actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(byte)
     */
    default AbstractByteAssert<?> thenAssert(final byte actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(Byte)
     */
    default AbstractByteAssert<?> thenAssert(final Byte actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(byte[])
     */
    default AbstractByteArrayAssert<?> thenAssert(final byte[] actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(byte[][])
     */
    default Byte2DArrayAssert thenAssert(final byte[][] actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(char)
     */
    default AbstractCharacterAssert<?> thenAssert(final char actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(char[])
     */
    default AbstractCharArrayAssert<?> thenAssert(final char[] actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(char[][])
     */
    default Char2DArrayAssert thenAssert(final char[][] actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(Character)
     */
    default AbstractCharacterAssert<?> thenAssert(final Character actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(Class)
     */
    default ClassAssert thenAssert(final Class<?> actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(T)
     */
    default <T extends Comparable<? super T>> AbstractComparableAssert<?, T> thenAssert(final T actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(Iterable)
     */
    default <T> IterableAssert<T> thenAssert(final Iterable<? extends T> actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(Iterator)
     */
    default <T> IteratorAssert<T> thenAssert(final Iterator<? extends T> actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(Iterable, AssertFactory)
     */
    default <ACTUAL extends Iterable<? extends ELEMENT>, ELEMENT, ELEMENT_ASSERT extends AbstractAssert<ELEMENT_ASSERT, ELEMENT>>
    FactoryBasedNavigableIterableAssert<?, ACTUAL, ELEMENT, ELEMENT_ASSERT> thenAssert(final Iterable<? extends ELEMENT> actual,
                                                                                       final AssertFactory<ELEMENT, ELEMENT_ASSERT> assertFactory) {
        return BDDAssertions.then(actual, assertFactory);
    }

    /**
     * @see BDDAssertions#then(ACTUAL, Class)
     */
    default <ACTUAL extends Iterable<? extends ELEMENT>, ELEMENT, ELEMENT_ASSERT extends AbstractAssert<ELEMENT_ASSERT, ELEMENT>>
    ClassBasedNavigableIterableAssert<?, ACTUAL, ELEMENT, ELEMENT_ASSERT> thenAssert(final ACTUAL actual,
                                                                                     final Class<ELEMENT_ASSERT> assertClass) {
        return BDDAssertions.then(actual, assertClass);
    }

    /**
     * @see BDDAssertions#then(List, AssertFactory)
     */
    default <ACTUAL extends List<? extends ELEMENT>, ELEMENT, ELEMENT_ASSERT extends AbstractAssert<ELEMENT_ASSERT, ELEMENT>>
    FactoryBasedNavigableListAssert<?, ACTUAL, ELEMENT, ELEMENT_ASSERT> thenAssert(final List<? extends ELEMENT> actual,
                                                                                   final AssertFactory<ELEMENT, ELEMENT_ASSERT> assertFactory) {
        return BDDAssertions.then(actual, assertFactory);
    }

    /**
     * @see BDDAssertions#then(List, Class)
     */
    default <ELEMENT, ACTUAL extends List<? extends ELEMENT>, ELEMENT_ASSERT extends AbstractAssert<ELEMENT_ASSERT, ELEMENT>>
    ClassBasedNavigableListAssert<?, ACTUAL, ELEMENT, ELEMENT_ASSERT> thenAssert(final List<? extends ELEMENT> actual,
                                                                                 final Class<ELEMENT_ASSERT> assertClass) {
        return BDDAssertions.then(actual, assertClass);
    }

    /**
     * @see BDDAssertions#then(double)
     */
    default AbstractDoubleAssert<?> thenAssert(final double actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(Double)
     */
    default AbstractDoubleAssert<?> thenAssert(final Double actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(double[])
     */
    default AbstractDoubleArrayAssert<?> thenAssert(final double[] actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(double[][])
     */
    default Double2DArrayAssert thenAssert(final double[][] actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(File)
     */
    default AbstractFileAssert<?> thenAssert(final File actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(Path)
     */
    default AbstractPathAssert<?> thenAssert(final Path actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(Future)
     */
    default <RESULT> FutureAssert<RESULT> thenAssert(final Future<RESULT> actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(InputStream)
     */
    default AbstractInputStreamAssert<?, ? extends InputStream> thenAssert(final InputStream actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(float)
     */
    default AbstractFloatAssert<?> thenAssert(final float actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(Float)
     */
    default AbstractFloatAssert<?> thenAssert(final Float actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(float[])
     */
    default AbstractFloatArrayAssert<?> thenAssert(final float[] actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(float[][])
     */
    default Float2DArrayAssert thenAssert(final float[][] actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(int)
     */
    default AbstractIntegerAssert<?> thenAssert(final int actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(int[])
     */
    default AbstractIntArrayAssert<?> thenAssert(final int[] actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(int[][])
     */
    default Int2DArrayAssert thenAssert(final int[][] actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(Integer)
     */
    default AbstractIntegerAssert<?> thenAssert(final Integer actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(Collection)
     */
    default <E> AbstractCollectionAssert<?, Collection<? extends E>, E, ObjectAssert<E>> thenAssert(final Collection<? extends E> actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(List)
     */
    default <T> ListAssert<T> thenAssert(final List<? extends T> actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(long)
     */
    default AbstractLongAssert<?> thenAssert(final long actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(Long)
     */
    default AbstractLongAssert<?> thenAssert(final Long actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(long[])
     */
    default AbstractLongArrayAssert<?> thenAssert(final long[] actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(long[][])
     */
    default Long2DArrayAssert thenAssert(final long[][] actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(T)
     */
    default <T> ObjectAssert<T> thenAssert(final T actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(T[])
     */
    default <T> ObjectArrayAssert<T> thenAssert(final T[] actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(T[][])
     */
    default <T> Object2DArrayAssert<T> thenAssert(final T[][] actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(Map)
     */
    default <K, V> MapAssert<K, V> thenAssert(final Map<K, V> actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(short)
     */
    default AbstractShortAssert<?> thenAssert(final short actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(Short)
     */
    default AbstractShortAssert<?> thenAssert(final Short actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(short[])
     */
    default AbstractShortArrayAssert<?> thenAssert(final short[] actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(short[][])
     */
    default Short2DArrayAssert thenAssert(final short[][] actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(CharSequence)
     */
    default AbstractCharSequenceAssert<?, ? extends CharSequence> thenAssert(final CharSequence actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(StringBuilder)
     */
    default AbstractCharSequenceAssert<?, ? extends CharSequence> thenAssert(final StringBuilder actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(StringBuffer)
     */
    default AbstractCharSequenceAssert<?, ? extends CharSequence> thenAssert(final StringBuffer actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(String)
     */
    default AbstractStringAssert<?> thenAssert(final String actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(Date)
     */
    default AbstractDateAssert<?> thenAssert(final Date actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(AtomicBoolean)
     */
    default AtomicBooleanAssert thenAssert(final AtomicBoolean actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(AtomicInteger)
     */
    default AtomicIntegerAssert thenAssert(final AtomicInteger actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(AtomicIntegerArray)
     */
    default AtomicIntegerArrayAssert thenAssert(final AtomicIntegerArray actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(AtomicIntegerFieldUpdater)
     */
    default <OBJECT> AtomicIntegerFieldUpdaterAssert<OBJECT> thenAssert(final AtomicIntegerFieldUpdater<OBJECT> actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(LongAdder)
     */
    default LongAdderAssert thenAssert(final LongAdder actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(AtomicLong)
     */
    default AtomicLongAssert thenAssert(final AtomicLong actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(AtomicLongArray)
     */
    default AtomicLongArrayAssert thenAssert(final AtomicLongArray actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(AtomicLongFieldUpdater)
     */
    default <OBJECT> AtomicLongFieldUpdaterAssert<OBJECT> thenAssert(final AtomicLongFieldUpdater<OBJECT> actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(AtomicReference)
     */
    default <VALUE> AtomicReferenceAssert<VALUE> thenAssert(final AtomicReference<VALUE> actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(AtomicReferenceArray)
     */
    default <ELEMENT> AtomicReferenceArrayAssert<ELEMENT> thenAssert(final AtomicReferenceArray<ELEMENT> actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(AtomicReferenceFieldUpdater)
     */
    default <FIELD, OBJECT> AtomicReferenceFieldUpdaterAssert<FIELD, OBJECT> thenAssert(final AtomicReferenceFieldUpdater<OBJECT, FIELD> actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(AtomicMarkableReference)
     */
    default <VALUE> AtomicMarkableReferenceAssert<VALUE> thenAssert(final AtomicMarkableReference<VALUE> actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(AtomicStampedReference)
     */
    default <VALUE> AtomicStampedReferenceAssert<VALUE> thenAssert(final AtomicStampedReference<VALUE> actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(Throwable)
     */
    default AbstractThrowableAssert<?, ? extends Throwable> thenAssert(final Throwable actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#thenThrownBy(ThrowableAssert.ThrowingCallable)
     */
    @CanIgnoreReturnValue
    default AbstractThrowableAssert<?, ? extends Throwable> thenThrownBy(final ThrowableAssert.ThrowingCallable shouldRaiseThrowable) {
        return BDDAssertions.thenThrownBy(shouldRaiseThrowable);
    }

    /**
     * @see BDDAssertions#thenThrownBy(ThrowableAssert.ThrowingCallable, String, Object...)
     */
    @CanIgnoreReturnValue
    default AbstractThrowableAssert<?, ? extends Throwable> thenThrownBy(final ThrowableAssert.ThrowingCallable shouldRaiseThrowable,
                                                                         final String description, final Object... args) {
        return BDDAssertions.thenThrownBy(shouldRaiseThrowable, description, args);
    }

    /**
     * @see BDDAssertions#thenCode(ThrowableAssert.ThrowingCallable)
     */
    default AbstractThrowableAssert<?, ? extends Throwable> thenCode(final ThrowableAssert.ThrowingCallable shouldRaiseOrNotThrowable) {
        return BDDAssertions.thenCode(shouldRaiseOrNotThrowable);
    }

    /**
     * @see BDDAssertions#thenObject(T)
     */
    default <T> ObjectAssert<T> thenObject(final T actual) {
        return BDDAssertions.thenObject(actual);
    }

    /**
     * @see BDDAssertions#thenWith(Object, Consumer)
     */
    default <T> ObjectAssert<T> thenWith(final T actual, final Consumer<T> requirements) {
        return BDDAssertions.thenWith(actual, requirements);
    }

    /**
     * @see BDDAssertions#then(LocalDate)
     */
    default AbstractLocalDateAssert<?> thenAssert(final LocalDate actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(LocalDateTime)
     */
    default AbstractLocalDateTimeAssert<?> thenAssert(final LocalDateTime actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(ZonedDateTime)
     */
    default AbstractZonedDateTimeAssert<?> thenAssert(final ZonedDateTime actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(LocalTime)
     */
    default AbstractLocalTimeAssert<?> thenAssert(final LocalTime actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(OffsetTime)
     */
    default AbstractOffsetTimeAssert<?> thenAssert(final OffsetTime actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(Instant)
     */
    default AbstractInstantAssert<?> thenAssert(final Instant actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(Duration)
     */
    default AbstractDurationAssert<?> thenAssert(final Duration actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(Period)
     */
    default AbstractPeriodAssert<?> thenAssert(final Period actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(URI)
     */
    default AbstractUriAssert<?> thenAssert(final URI actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(URL)
     */
    default AbstractUrlAssert<?> thenAssert(final URL actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(OffsetDateTime)
     */
    default AbstractOffsetDateTimeAssert<?> thenAssert(final OffsetDateTime actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(CompletableFuture)
     */
    default <RESULT> CompletableFutureAssert<RESULT> thenAssert(final CompletableFuture<RESULT> future) {
        return BDDAssertions.then(future);
    }

    /**
     * @see BDDAssertions#then(CompletionStage)
     */
    default <RESULT> CompletableFutureAssert<RESULT> thenAssert(final CompletionStage<RESULT> actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(T)
     */
    default <T extends AssertDelegateTarget> T thenAssert(final T assertion) {
        return BDDAssertions.then(assertion);
    }

    /**
     * @see BDDAssertions#then(AssertProvider)
     */
    default <T> T thenAssert(final AssertProvider<T> component) {
        return component.assertThat();
    }

    /**
     * @see BDDAssertions#then(Stream)
     */
    default <ELEMENT> ListAssert<ELEMENT> thenAssert(final Stream<? extends ELEMENT> actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(DoubleStream)
     */
    default ListAssert<Double> thenAssert(final DoubleStream actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(LongStream)
     */
    default ListAssert<Long> thenAssert(final LongStream actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(IntStream)
     */
    default ListAssert<Integer> thenAssert(final IntStream actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#then(Spliterator)
     */
    default <ELEMENT> SpliteratorAssert<ELEMENT> thenAssert(final Spliterator<ELEMENT> actual) {
        return BDDAssertions.then(actual);
    }

    /**
     * @see BDDAssertions#thenNoException()
     */
    default NotThrownAssert thenNoException() {
        return BDDAssertions.thenNoException();
    }

    /**
     * @see BDDAssertions#thenExceptionOfType(Class)
     */
    default <T extends Throwable> ThrowableTypeAssert<T> thenExceptionOfType(final Class<? extends T> exceptionType) {
        return BDDAssertions.thenExceptionOfType(exceptionType);
    }

    /**
     * @see BDDAssertions#thenNullPointerException()
     */
    default ThrowableTypeAssert<NullPointerException> thenNullPointerException() {
        return BDDAssertions.thenNullPointerException();
    }

    /**
     * @see BDDAssertions#thenIllegalArgumentException()
     */
    default ThrowableTypeAssert<IllegalArgumentException> thenIllegalArgumentException() {
        return BDDAssertions.thenIllegalArgumentException();
    }

    /**
     * @see BDDAssertions#thenIOException()
     */
    default ThrowableTypeAssert<IOException> thenIOException() {
        return BDDAssertions.thenIOException();
    }

    /**
     * @see BDDAssertions#thenIllegalStateException()
     */
    default ThrowableTypeAssert<IllegalStateException> thenIllegalStateException() {
        return BDDAssertions.thenIllegalStateException();
    }


}
