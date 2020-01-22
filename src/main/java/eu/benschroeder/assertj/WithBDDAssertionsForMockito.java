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
import org.assertj.core.api.AbstractComparableAssert;
import org.assertj.core.api.AbstractDateAssert;
import org.assertj.core.api.AbstractDoubleArrayAssert;
import org.assertj.core.api.AbstractDoubleAssert;
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
import org.assertj.core.api.ClassAssert;
import org.assertj.core.api.ClassBasedNavigableIterableAssert;
import org.assertj.core.api.ClassBasedNavigableListAssert;
import org.assertj.core.api.CompletableFutureAssert;
import org.assertj.core.api.DoublePredicateAssert;
import org.assertj.core.api.FactoryBasedNavigableIterableAssert;
import org.assertj.core.api.FactoryBasedNavigableListAssert;
import org.assertj.core.api.FutureAssert;
import org.assertj.core.api.IntPredicateAssert;
import org.assertj.core.api.IterableAssert;
import org.assertj.core.api.IteratorAssert;
import org.assertj.core.api.ListAssert;
import org.assertj.core.api.LongPredicateAssert;
import org.assertj.core.api.MapAssert;
import org.assertj.core.api.ObjectArrayAssert;
import org.assertj.core.api.ObjectAssert;
import org.assertj.core.api.OptionalAssert;
import org.assertj.core.api.OptionalDoubleAssert;
import org.assertj.core.api.OptionalIntAssert;
import org.assertj.core.api.OptionalLongAssert;
import org.assertj.core.api.PredicateAssert;
import org.assertj.core.api.SpliteratorAssert;
import org.assertj.core.api.ThrowableAssert;
import org.assertj.core.util.CanIgnoreReturnValue;

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
  default <T> PredicateAssert<T> thenAssert(Predicate<T> actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(IntPredicate)
   */
  default IntPredicateAssert thenAssert(IntPredicate actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(LongPredicate)
   */
  default LongPredicateAssert thenAssert(LongPredicate actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(DoublePredicate)
   */
  default DoublePredicateAssert thenAssert(DoublePredicate actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(Optional)
   */
  default <VALUE> OptionalAssert<VALUE> thenAssert(Optional<VALUE> optional) {
    return BDDAssertions.then(optional);
  }

  /**
   * @see BDDAssertions#then(OptionalInt)
   */
  default OptionalIntAssert thenAssert(OptionalInt optional) {
    return BDDAssertions.then(optional);
  }

  /**
   * @see BDDAssertions#then(OptionalLong)
   */
  default OptionalLongAssert thenAssert(OptionalLong optional) {
    return BDDAssertions.then(optional);
  }

  /**
   * @see BDDAssertions#then(OptionalDouble)
   */
  default OptionalDoubleAssert thenAssert(OptionalDouble optional) {
    return BDDAssertions.then(optional);
  }

  /**
   * @see BDDAssertions#then(BigDecimal)
   */
  default AbstractBigDecimalAssert<?> thenAssert(BigDecimal actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(BigInteger)
   */
  default AbstractBigIntegerAssert<?> thenAssert(BigInteger actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(boolean)
   */
  default AbstractBooleanAssert<?> thenAssert(boolean actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(Boolean)
   */
  default AbstractBooleanAssert<?> thenAssert(Boolean actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(boolean[])
   */
  default AbstractBooleanArrayAssert<?> thenAssert(boolean[] actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(byte)
   */
  default AbstractByteAssert<?> thenAssert(byte actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(Byte)
   */
  default AbstractByteAssert<?> thenAssert(Byte actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(byte[])
   */
  default AbstractByteArrayAssert<?> thenAssert(byte[] actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(char)
   */
  default AbstractCharacterAssert<?> thenAssert(char actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(char[])
   */
  default AbstractCharArrayAssert<?> thenAssert(char[] actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(Character)
   */
  default AbstractCharacterAssert<?> thenAssert(Character actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(Class)
   */
  default ClassAssert thenAssert(Class<?> actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(T)
   */
  default <T extends Comparable<? super T>> AbstractComparableAssert<?, T> thenAssert(T actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(Iterable)
   */
  default <T> IterableAssert<T> thenAssert(Iterable<? extends T> actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(Iterator)
   */
  default <T> IteratorAssert<T> thenAssert(Iterator<? extends T> actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(Iterable, AssertFactory)
   */
  default <ACTUAL extends Iterable<? extends ELEMENT>, ELEMENT, ELEMENT_ASSERT extends AbstractAssert<ELEMENT_ASSERT, ELEMENT>>
  FactoryBasedNavigableIterableAssert<?, ACTUAL, ELEMENT, ELEMENT_ASSERT> thenAssert(Iterable<? extends ELEMENT> actual,
                                                                                     AssertFactory<ELEMENT, ELEMENT_ASSERT> assertFactory) {
    return BDDAssertions.then(actual, assertFactory);
  }

  /**
   * @see BDDAssertions#then(ACTUAL, Class)
   */
  default <ACTUAL extends Iterable<? extends ELEMENT>, ELEMENT, ELEMENT_ASSERT extends AbstractAssert<ELEMENT_ASSERT, ELEMENT>>
  ClassBasedNavigableIterableAssert<?, ACTUAL, ELEMENT, ELEMENT_ASSERT> thenAssert(ACTUAL actual,
                                                                                   Class<ELEMENT_ASSERT> assertClass) {
    return BDDAssertions.then(actual, assertClass);
  }

  /**
   * @see BDDAssertions#then(List, AssertFactory)
   */
  default <ACTUAL extends List<? extends ELEMENT>, ELEMENT, ELEMENT_ASSERT extends AbstractAssert<ELEMENT_ASSERT, ELEMENT>>
  FactoryBasedNavigableListAssert<?, ACTUAL, ELEMENT, ELEMENT_ASSERT> thenAssert(List<? extends ELEMENT> actual,
                                                                                 AssertFactory<ELEMENT, ELEMENT_ASSERT> assertFactory) {
    return BDDAssertions.then(actual, assertFactory);
  }

  /**
   * @see BDDAssertions#then(List, Class)
   */
  default <ELEMENT, ACTUAL extends List<? extends ELEMENT>, ELEMENT_ASSERT extends AbstractAssert<ELEMENT_ASSERT, ELEMENT>>
  ClassBasedNavigableListAssert<?, ACTUAL, ELEMENT, ELEMENT_ASSERT> thenAssert(List<? extends ELEMENT> actual,
                                                                               Class<ELEMENT_ASSERT> assertClass) {
    return BDDAssertions.then(actual, assertClass);
  }

  /**
   * @see BDDAssertions#then(double)
   */
  default AbstractDoubleAssert<?> thenAssert(double actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(Double)
   */
  default AbstractDoubleAssert<?> thenAssert(Double actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(double[])
   */
  default AbstractDoubleArrayAssert<?> thenAssert(double[] actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(File)
   */
  default AbstractFileAssert<?> thenAssert(File actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(Path)
   */
  default AbstractPathAssert<?> thenAssert(Path actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(Future)
   */
  default <RESULT> FutureAssert<RESULT> thenAssert(Future<RESULT> actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(InputStream)
   */
  default AbstractInputStreamAssert<?, ? extends InputStream> thenAssert(InputStream actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(float)
   */
  default AbstractFloatAssert<?> thenAssert(float actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(Float)
   */
  default AbstractFloatAssert<?> thenAssert(Float actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(float[])
   */
  default AbstractFloatArrayAssert<?> thenAssert(float[] actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(int)
   */
  default AbstractIntegerAssert<?> thenAssert(int actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(int[])
   */
  default AbstractIntArrayAssert<?> thenAssert(int[] actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(Integer)
   */
  default AbstractIntegerAssert<?> thenAssert(Integer actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(List)
   */
  default <T> ListAssert<T> thenAssert(List<? extends T> actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(long)
   */
  default AbstractLongAssert<?> thenAssert(long actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(Long)
   */
  default AbstractLongAssert<?> thenAssert(Long actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(long[])
   */
  default AbstractLongArrayAssert<?> thenAssert(long[] actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(T)
   */
  default <T> ObjectAssert<T> thenAssert(T actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(T[])
   */
  default <T> ObjectArrayAssert<T> thenAssert(T[] actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(Map)
   */
  default <K, V> MapAssert<K, V> thenAssert(Map<K, V> actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(short)
   */
  default AbstractShortAssert<?> thenAssert(short actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(Short)
   */
  default AbstractShortAssert<?> thenAssert(Short actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(short[])
   */
  default AbstractShortArrayAssert<?> thenAssert(short[] actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(CharSequence)
   */
  default AbstractCharSequenceAssert<?, ? extends CharSequence> thenAssert(CharSequence actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(StringBuilder)
   */
  default AbstractCharSequenceAssert<?, ? extends CharSequence> thenAssert(StringBuilder actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(StringBuffer)
   */
  default AbstractCharSequenceAssert<?, ? extends CharSequence> thenAssert(StringBuffer actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(String)
   */
  default AbstractStringAssert<?> thenAssert(String actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(Date)
   */
  default AbstractDateAssert<?> thenAssert(Date actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(AtomicBoolean)
   */
  default AtomicBooleanAssert thenAssert(AtomicBoolean actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(AtomicInteger)
   */
  default AtomicIntegerAssert thenAssert(AtomicInteger actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(AtomicIntegerArray)
   */
  default AtomicIntegerArrayAssert thenAssert(AtomicIntegerArray actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(AtomicIntegerFieldUpdater)
   */
  default <OBJECT> AtomicIntegerFieldUpdaterAssert<OBJECT> thenAssert(AtomicIntegerFieldUpdater<OBJECT> actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(AtomicLong)
   */
  default AtomicLongAssert thenAssert(AtomicLong actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(AtomicLongArray)
   */
  default AtomicLongArrayAssert thenAssert(AtomicLongArray actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(AtomicLongFieldUpdater)
   */
  default <OBJECT> AtomicLongFieldUpdaterAssert<OBJECT> thenAssert(AtomicLongFieldUpdater<OBJECT> actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(AtomicReference)
   */
  default <VALUE> AtomicReferenceAssert<VALUE> thenAssert(AtomicReference<VALUE> actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(AtomicReferenceArray)
   */
  default <ELEMENT> AtomicReferenceArrayAssert<ELEMENT> thenAssert(AtomicReferenceArray<ELEMENT> actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(AtomicReferenceFieldUpdater)
   */
  default <FIELD, OBJECT> AtomicReferenceFieldUpdaterAssert<FIELD, OBJECT> thenAssert(AtomicReferenceFieldUpdater<OBJECT, FIELD> actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(AtomicMarkableReference)
   */
  default <VALUE> AtomicMarkableReferenceAssert<VALUE> thenAssert(AtomicMarkableReference<VALUE> actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(AtomicStampedReference)
   */
  default <VALUE> AtomicStampedReferenceAssert<VALUE> thenAssert(AtomicStampedReference<VALUE> actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(Throwable)
   */
  default AbstractThrowableAssert<?, ? extends Throwable> thenAssert(Throwable actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#thenThrownBy(ThrowableAssert.ThrowingCallable)
   */
  @CanIgnoreReturnValue
  default AbstractThrowableAssert<?, ? extends Throwable> thenThrownBy(ThrowableAssert.ThrowingCallable shouldRaiseThrowable) {
    return BDDAssertions.thenThrownBy(shouldRaiseThrowable);
  }

  /**
   * @see BDDAssertions#thenThrownBy(ThrowableAssert.ThrowingCallable, String, Object...)
   */
  @CanIgnoreReturnValue
  default AbstractThrowableAssert<?, ? extends Throwable> thenThrownBy(ThrowableAssert.ThrowingCallable shouldRaiseThrowable,
                                                                       String description, Object... args) {
    return BDDAssertions.thenThrownBy(shouldRaiseThrowable, description, args);
  }

  /**
   * @see BDDAssertions#thenCode(ThrowableAssert.ThrowingCallable)
   */
  default AbstractThrowableAssert<?, ? extends Throwable> thenCode(ThrowableAssert.ThrowingCallable shouldRaiseOrNotThrowable) {
    return BDDAssertions.thenCode(shouldRaiseOrNotThrowable);
  }

  /**
   * @see BDDAssertions#thenObject(T)
   */
  default <T> ObjectAssert<T> thenObject(T actual) {
    return BDDAssertions.thenObject(actual);
  }

  /**
   * @see BDDAssertions#then(LocalDate)
   */
  default AbstractLocalDateAssert<?> thenAssert(LocalDate actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(LocalDateTime)
   */
  default AbstractLocalDateTimeAssert<?> thenAssert(LocalDateTime actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(ZonedDateTime)
   */
  default AbstractZonedDateTimeAssert<?> thenAssert(ZonedDateTime actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(LocalTime)
   */
  default AbstractLocalTimeAssert<?> thenAssert(LocalTime actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(OffsetTime)
   */
  default AbstractOffsetTimeAssert<?> thenAssert(OffsetTime actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(Instant)
   */
  default AbstractInstantAssert<?> thenAssert(Instant actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(URI)
   */
  default AbstractUriAssert<?> thenAssert(URI actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(URL)
   */
  default AbstractUrlAssert<?> thenAssert(URL actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(OffsetDateTime)
   */
  default AbstractOffsetDateTimeAssert<?> thenAssert(OffsetDateTime actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(CompletableFuture)
   */
  default <RESULT> CompletableFutureAssert<RESULT> thenAssert(CompletableFuture<RESULT> future) {
    return BDDAssertions.then(future);
  }

  /**
   * @see BDDAssertions#then(CompletionStage)
   */
  default <RESULT> CompletableFutureAssert<RESULT> thenAssert(CompletionStage<RESULT> actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(T)
   */
  default <T extends AssertDelegateTarget> T thenAssert(T assertion) {
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
  default <ELEMENT> ListAssert<ELEMENT> thenAssert(Stream<? extends ELEMENT> actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(DoubleStream)
   */
  default ListAssert<Double> thenAssert(DoubleStream actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(LongStream)
   */
  default ListAssert<Long> thenAssert(LongStream actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(IntStream)
   */
  default ListAssert<Integer> thenAssert(IntStream actual) {
    return BDDAssertions.then(actual);
  }

  /**
   * @see BDDAssertions#then(Spliterator)
   */
  default <ELEMENT> SpliteratorAssert<ELEMENT> thenAssert(Spliterator<ELEMENT> actual) {
    return BDDAssertions.then(actual);
  }

}
