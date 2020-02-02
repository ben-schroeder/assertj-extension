package eu.benschroeder.assertj;

import org.assertj.core.api.AbstractBigDecimalAssert;
import org.assertj.core.api.AbstractBigIntegerAssert;
import org.assertj.core.api.AbstractBooleanArrayAssert;
import org.assertj.core.api.AbstractBooleanAssert;
import org.assertj.core.api.AbstractByteArrayAssert;
import org.assertj.core.api.AbstractByteAssert;
import org.assertj.core.api.AbstractCharArrayAssert;
import org.assertj.core.api.AbstractCharSequenceAssert;
import org.assertj.core.api.AbstractCharacterAssert;
import org.assertj.core.api.AbstractClassAssert;
import org.assertj.core.api.AbstractComparableAssert;
import org.assertj.core.api.AbstractDateAssert;
import org.assertj.core.api.AbstractDoubleArrayAssert;
import org.assertj.core.api.AbstractDoubleAssert;
import org.assertj.core.api.AbstractFileAssert;
import org.assertj.core.api.AbstractFloatArrayAssert;
import org.assertj.core.api.AbstractFloatAssert;
import org.assertj.core.api.AbstractFutureAssert;
import org.assertj.core.api.AbstractInputStreamAssert;
import org.assertj.core.api.AbstractInstantAssert;
import org.assertj.core.api.AbstractIntArrayAssert;
import org.assertj.core.api.AbstractIntegerAssert;
import org.assertj.core.api.AbstractListAssert;
import org.assertj.core.api.AbstractLocalDateAssert;
import org.assertj.core.api.AbstractLocalDateTimeAssert;
import org.assertj.core.api.AbstractLocalTimeAssert;
import org.assertj.core.api.AbstractLongArrayAssert;
import org.assertj.core.api.AbstractLongAssert;
import org.assertj.core.api.AbstractMapAssert;
import org.assertj.core.api.AbstractOffsetDateTimeAssert;
import org.assertj.core.api.AbstractOffsetTimeAssert;
import org.assertj.core.api.AbstractPathAssert;
import org.assertj.core.api.AbstractShortArrayAssert;
import org.assertj.core.api.AbstractShortAssert;
import org.assertj.core.api.AbstractSpliteratorAssert;
import org.assertj.core.api.AbstractStringAssert;
import org.assertj.core.api.AbstractThrowableAssert;
import org.assertj.core.api.AbstractUriAssert;
import org.assertj.core.api.AbstractUrlAssert;
import org.assertj.core.api.AbstractZonedDateTimeAssert;
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
import org.assertj.core.api.Assumptions;
import org.assertj.core.api.CompletableFutureAssert;
import org.assertj.core.api.DoublePredicateAssert;
import org.assertj.core.api.FactoryBasedNavigableListAssert;
import org.assertj.core.api.IntPredicateAssert;
import org.assertj.core.api.IteratorAssert;
import org.assertj.core.api.LongPredicateAssert;
import org.assertj.core.api.ObjectAssert;
import org.assertj.core.api.OptionalAssert;
import org.assertj.core.api.OptionalDoubleAssert;
import org.assertj.core.api.OptionalIntAssert;
import org.assertj.core.api.OptionalLongAssert;
import org.assertj.core.api.ProxyableIterableAssert;
import org.assertj.core.api.ProxyableListAssert;
import org.assertj.core.api.ProxyableObjectArrayAssert;
import org.assertj.core.api.ProxyableObjectAssert;
import org.assertj.core.api.ProxyablePredicateAssert;
import org.assertj.core.api.ThrowableAssert;

import java.io.File;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.net.URL;
import java.nio.file.Path;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZonedDateTime;
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
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.function.Predicate;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * AssertJ {@link Assumptions} as an interface to use in test classes.
 * <p>
 * Inspired by https://blog.javabien.net/2014/04/23/what-if-assertj-used-java-8/
 *
 * @author Benjamin Schröder
 */
public interface WithAssumptions {

  /**
   * @see Assumptions#assumeThat(boolean)
   */
  default AbstractBooleanAssert<?> assumeThat(boolean actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(Boolean)
   */
  default AbstractBooleanAssert<?> assumeThat(Boolean actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(boolean[])
   */
  default AbstractBooleanArrayAssert<?> assumeThat(boolean[] actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(byte)
   */
  default AbstractByteAssert<?> assumeThat(byte actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(Byte)
   */
  default AbstractByteAssert<?> assumeThat(Byte actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(byte[])
   */
  default AbstractByteArrayAssert<?> assumeThat(byte[] actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(short)
   */
  default AbstractShortAssert<?> assumeThat(short actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(Short)
   */
  default AbstractShortAssert<?> assumeThat(Short actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(short[])
   */
  default AbstractShortArrayAssert<?> assumeThat(short[] actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(int)
   */
  default AbstractIntegerAssert<?> assumeThat(int actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(Integer)
   */
  default AbstractIntegerAssert<?> assumeThat(Integer actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(int[])
   */
  default AbstractIntArrayAssert<?> assumeThat(int[] actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(BigInteger)
   */
  default AbstractBigIntegerAssert<?> assumeThat(BigInteger actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(long)
   */
  default AbstractLongAssert<?> assumeThat(long actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(Long)
   */
  default AbstractLongAssert<?> assumeThat(Long actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(long[])
   */
  default AbstractLongArrayAssert<?> assumeThat(long[] actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(float)
   */
  default AbstractFloatAssert<?> assumeThat(float actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(Float)
   */
  default AbstractFloatAssert<?> assumeThat(Float actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(float[])
   */
  default AbstractFloatArrayAssert<?> assumeThat(float[] actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(double)
   */
  default AbstractDoubleAssert<?> assumeThat(double actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(Double)
   */
  default AbstractDoubleAssert<?> assumeThat(Double actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(double[])
   */
  default AbstractDoubleArrayAssert<?> assumeThat(double[] actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(BigDecimal)
   */
  default AbstractBigDecimalAssert<?> assumeThat(BigDecimal actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(char)
   */
  default AbstractCharacterAssert<?> assumeThat(char actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(Character)
   */
  default AbstractCharacterAssert<?> assumeThat(Character actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(char[])
   */
  default AbstractCharArrayAssert<?> assumeThat(char[] actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(CharSequence)
   */
  default AbstractCharSequenceAssert<?, ? extends CharSequence> assumeThat(CharSequence actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(String)
   */
  default AbstractStringAssert<?> assumeThat(String actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(StringBuilder)
   */
  default AbstractCharSequenceAssert<?, ? extends CharSequence> assumeThat(StringBuilder actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(StringBuffer)
   */
  default AbstractCharSequenceAssert<?, ? extends CharSequence> assumeThat(StringBuffer actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(Class)
   */
  default AbstractClassAssert<?> assumeThat(Class<?> actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(T)
   */
  default <T> ProxyableObjectAssert<T> assumeThat(T actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(T[])
   */
  default <T> ProxyableObjectArrayAssert<T> assumeThat(T[] actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(T)
   */
  default <T> ProxyableObjectAssert<T> assumeThatObject(T actual) {
    return Assumptions.assumeThatObject(actual);
  }

  /**
   * @see Assumptions#assumeThat(Comparable)
   */
  @SuppressWarnings("unchecked")
  default <T extends Comparable<? super T>> AbstractComparableAssert<?, T> assumeThat(Comparable<? super T> actual) {
    return Assumptions.assumeThat((T) actual);
  }

  /**
   * @see Assumptions#assumeThat(Throwable)
   */
  default AbstractThrowableAssert<?, ? extends Throwable> assumeThat(Throwable actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThatCode(org.assertj.core.api.ThrowableAssert.ThrowingCallable)
   */
  default AbstractThrowableAssert<?, ? extends Throwable> assumeThatCode(ThrowableAssert.ThrowingCallable lambda) {
    return Assumptions.assumeThatCode(lambda);
  }

  /**
   * @see Assumptions#assumeThat(Iterable)
   */
  default <ELEMENT> ProxyableIterableAssert<ELEMENT> assumeThat(Iterable<? extends ELEMENT> actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(Iterator)
   */
  default <ELEMENT> IteratorAssert<ELEMENT> assumeThat(Iterator<? extends ELEMENT> actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(List)
   */
  default <ELEMENT> FactoryBasedNavigableListAssert<ProxyableListAssert<ELEMENT>, List<? extends ELEMENT>, ELEMENT, ObjectAssert<ELEMENT>> assumeThat(List<? extends ELEMENT> actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(Map)
   */
  default <K, V> AbstractMapAssert<?, ?, K, V> assumeThat(Map<K, V> actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(Predicate)
   */
  default <T> ProxyablePredicateAssert<T> assumeThat(Predicate<T> actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(IntPredicate)
   */
  default IntPredicateAssert assumeThat(IntPredicate actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(LongPredicate)
   */
  default LongPredicateAssert assumeThat(LongPredicate actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(DoublePredicate)
   */
  default DoublePredicateAssert assumeThat(DoublePredicate actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(Optional)
   */
  default <VALUE> OptionalAssert<VALUE> assumeThat(Optional<VALUE> actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(OptionalInt)
   */
  default OptionalIntAssert assumeThat(OptionalInt actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(OptionalLong)
   */
  default OptionalLongAssert assumeThat(OptionalLong actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(OptionalDouble)
   */
  default OptionalDoubleAssert assumeThat(OptionalDouble actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(Stream)
   */
  default <ELEMENT> AbstractListAssert<?, List<? extends ELEMENT>, ELEMENT, ObjectAssert<ELEMENT>> assumeThat(Stream<? extends ELEMENT> actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(IntStream)
   */
  default AbstractListAssert<?, List<? extends Integer>, Integer, ObjectAssert<Integer>> assumeThat(IntStream actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(Spliterator)
   */
  default <ELEMENT> AbstractSpliteratorAssert<?, ELEMENT> assumeThat(Spliterator<ELEMENT> actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(LongStream)
   */
  default AbstractListAssert<?, List<? extends Long>, Long, ObjectAssert<Long>> assumeThat(LongStream actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(DoubleStream)
   */
  default AbstractListAssert<?, List<? extends Double>, Double, ObjectAssert<Double>> assumeThat(DoubleStream actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(Future)
   */
  default <RESULT> AbstractFutureAssert<?, ? extends Future<? extends RESULT>, RESULT> assumeThat(Future<RESULT> future) {
    return Assumptions.assumeThat(future);
  }

  /**
   * @see Assumptions#assumeThat(CompletableFuture)
   */
  default <RESULT> CompletableFutureAssert<RESULT> assumeThat(CompletableFuture<RESULT> future) {
    return Assumptions.assumeThat(future);
  }

  /**
   * @see Assumptions#assumeThat(CompletionStage)
   */
  default <RESULT> CompletableFutureAssert<RESULT> assumeThat(CompletionStage<RESULT> stage) {
    return Assumptions.assumeThat(stage);
  }

  /**
   * @see Assumptions#assumeThat(AtomicBoolean)
   */
  default AtomicBooleanAssert assumeThat(AtomicBoolean actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(AtomicInteger)
   */
  default AtomicIntegerAssert assumeThat(AtomicInteger actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(AtomicIntegerArray)
   */
  default AtomicIntegerArrayAssert assumeThat(AtomicIntegerArray actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(AtomicIntegerFieldUpdater)
   */
  default <OBJECT> AtomicIntegerFieldUpdaterAssert<OBJECT> assumeThat(AtomicIntegerFieldUpdater<OBJECT> actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(AtomicLong)
   */
  default AtomicLongAssert assumeThat(AtomicLong actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(AtomicLongArray)
   */
  default AtomicLongArrayAssert assumeThat(AtomicLongArray actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(AtomicLongFieldUpdater)
   */
  default <OBJECT> AtomicLongFieldUpdaterAssert<OBJECT> assumeThat(AtomicLongFieldUpdater<OBJECT> actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(AtomicReference)
   */
  default <VALUE> AtomicReferenceAssert<VALUE> assumeThat(AtomicReference<VALUE> actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(AtomicReferenceArray)
   */
  default <ELEMENT> AtomicReferenceArrayAssert<ELEMENT> assumeThat(AtomicReferenceArray<ELEMENT> actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(AtomicReferenceFieldUpdater)
   */
  default <FIELD, OBJECT> AtomicReferenceFieldUpdaterAssert<FIELD, OBJECT> assumeThat(AtomicReferenceFieldUpdater<OBJECT, FIELD> actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(AtomicMarkableReference)
   */
  default <VALUE> AtomicMarkableReferenceAssert<VALUE> assumeThat(AtomicMarkableReference<VALUE> actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(AtomicStampedReference)
   */
  default <VALUE> AtomicStampedReferenceAssert<VALUE> assumeThat(AtomicStampedReference<VALUE> actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(Date)
   */
  default AbstractDateAssert<?> assumeThat(Date actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(LocalDate)
   */
  default AbstractLocalDateAssert<?> assumeThat(LocalDate actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(LocalTime)
   */
  default AbstractLocalTimeAssert<?> assumeThat(LocalTime actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(OffsetTime)
   */
  default AbstractOffsetTimeAssert<?> assumeThat(OffsetTime actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(LocalDateTime)
   */
  default AbstractLocalDateTimeAssert<?> assumeThat(LocalDateTime actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(Instant)
   */
  default AbstractInstantAssert<?> assumeThat(Instant actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(OffsetDateTime)
   */
  default AbstractOffsetDateTimeAssert<?> assumeThat(OffsetDateTime actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(ZonedDateTime)
   */
  default AbstractZonedDateTimeAssert<?> assumeThat(ZonedDateTime actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(InputStream)
   */
  default AbstractInputStreamAssert<?, ? extends InputStream> assumeThat(InputStream actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(File)
   */
  default AbstractFileAssert<?> assumeThat(File actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(Path)
   */
  default AbstractPathAssert<?> assumeThat(Path actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(URI)
   */
  default AbstractUriAssert<?> assumeThat(URI actual) {
    return Assumptions.assumeThat(actual);
  }

  /**
   * @see Assumptions#assumeThat(URL)
   */
  default AbstractUrlAssert<?> assumeThat(URL actual) {
    return Assumptions.assumeThat(actual);
  }

}
