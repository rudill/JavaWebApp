<%@ page import="java.sql.*" %><%--
  Created by IntelliJ IDEA.
  User: Ruvinda Dilshan
  Date: 4/8/2024
  Time: 9:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html class="h-full">
<head>
    <title>Admin Dashboard</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/daisyui@4.10.1/dist/full.min.css" rel="stylesheet" type="text/css" />
    <script src="https://cdn.tailwindcss.com"></script>

    <script>
        function showEditModal(id, name, brand, price, category, description, image) {
            // Populate the form fields
            document.getElementById('upName').value = name;
            document.getElementById('upBrand').value = brand;
            document.getElementById('upPrice').value = price;
            document.getElementById('upCategory').value = category;
            document.getElementById('upDescription').value = description;

            document.getElementById('upImage').src = image;


            // Set the form action to update the product with the correct ID
            document.getElementById('editForm').action = "hello-servlet?method=update&ID=" + id;

            // Show the modal
            my_modal_4.showModal();

        }

        function showDeleteAlert() {
            alert("Are you sure you want to delete this product?");
        }
    </script>
</head>
<body class="h-full">

<div class="min-h-full">
    <nav class="bg-gray-800">
        <div class="mx-auto max-w-7xl px-4 sm:px-6 lg:px-8">
            <div class="flex h-16 items-center justify-between">
                <div class="flex items-center">
<%--                    <div class="flex-shrink-0">--%>
<%--                        <img class="h-8 w-8" src="https://tailwindui.com/img/logos/mark.svg?color=indigo&shade=500" alt="Your Company">--%>
<%--                    </div>--%>
                    <div class="hidden md:block">
                        <div class="ml-10 flex items-baseline space-x-4">
                            <!-- Current: "bg-gray-900 text-white", Default: "text-gray-300 hover:bg-gray-700 hover:text-white" -->
                            <a href="#" class="bg-gray-900 text-white rounded-md px-3 py-2 text-sm font-medium" aria-current="page">Dashboard</a>

                        </div>
                    </div>
                </div>


            </div>
        </div>

        <!-- Mobile menu, show/hide based on menu state. -->
        <div class="md:hidden" id="mobile-menu">
            <div class="space-y-1 px-2 pb-3 pt-2 sm:px-3">
                <!-- Current: "bg-gray-900 text-white", Default: "text-gray-300 hover:bg-gray-700 hover:text-white" -->
                <a href="index.jsp" class="bg-gray-900 text-white block rounded-md px-3 py-2 text-base font-medium" aria-current="page">Dashboard</a>

            </div>

        </div>
    </nav>

    <main>
        <div class="mx-auto max-w-7xl py-6 sm:px-6 lg:px-8">
            <section class="p-3 sm:p-5">
                <div class="mx-auto max-w-screen-xl px-4 lg:px-12">
                    <!-- Start coding here -->
                    <div class="bg-white dark:bg-gray-800 relative shadow-md sm:rounded-lg overflow-hidden">
                        <div class="flex flex-col md:flex-row items-center justify-between space-y-3 md:space-y-0 md:space-x-4 p-4">
                            <div class="w-full md:w-1/2">

                            </div>
                            <div class="w-full md:w-auto flex flex-col md:flex-row space-y-2 md:space-y-0 items-stretch md:items-center justify-end md:space-x-3 flex-shrink-0">




                                <button type="button"
                                        class="  btn btn-outline btn-accent  flex items-center justify-center text-white bg-primary-700 hover:bg-primary-800 focus:ring-4 focus:ring-primary-300 font-medium rounded-lg text-sm px-4 py-2 dark:bg-primary-600 dark:hover:bg-primary-700 focus:outline-none dark:focus:ring-primary-800"
                                        onclick="my_modal_3.showModal()">
                                    <svg class="h-3.5 w-3.5 mr-2" fill="currentColor" viewbox="0 0 20 20"
                                         xmlns="http://www.w3.org/2000/svg" aria-hidden="true">
                                        <path clip-rule="evenodd" fill-rule="evenodd"
                                              d="M10 3a1 1 0 011 1v5h5a1 1 0 110 2h-5v5a1 1 0 11-2 0v-5H4a1 1 0 110-2h5V4a1 1 0 011-1z"/>
                                    </svg>
                                    Add product
                                </button>
                                <form method="get" action="hello-servlet">

                                   <input type="submit" value="Refresh">

                                </form>
                                <dialog id="my_modal_3" class="modal">
                                    <div class="modal-box">
                                        <h2 class="mb-4 text-xl font-bold text-gray-900 dark:text-white">Add
                                            product</h2>


                                        <form action="hello-servlet" method="post" enctype="multipart/form-data">

                                            <div class="grid gap-4 mb-4 sm:grid-cols-2 sm:gap-6 sm:mb-5">
                                                <div class="sm:col-span-2">
                                                    <label for="name"
                                                           class="block mb-2 text-sm font-medium text-gray-900 dark:text-white">Product
                                                        Name</label>
                                                    <input type="text" name="name" id="name"
                                                           class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-primary-500 dark:focus:border-primary-500"
                                                           placeholder="Type product name" required="">
                                                </div>
                                                <div class="w-full">
                                                    <label for="brand"
                                                           class="block mb-2 text-sm font-medium text-gray-900 dark:text-white">Brand</label>
                                                    <input type="text" name="brand" id="brand"
                                                           class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-primary-500 dark:focus:border-primary-500"
                                                           placeholder="Product brand" required="">
                                                </div>
                                                <div class="w-full">
                                                    <label for="price"
                                                           class="block mb-2 text-sm font-medium text-gray-900 dark:text-white">Price</label>
                                                    <input type="number" name="price" id="price"
                                                           class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-primary-500 dark:focus:border-primary-500"
                                                           placeholder="$299" required="">
                                                </div>


                                                <div class="w-full">
                                                    <label for="quantity"
                                                           class="block mb-2 text-sm font-medium text-gray-900 dark:text-white">Quantity</label>
                                                    <input type="number" name="quantity" id="quantity"
                                                           class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-primary-500 dark:focus:border-primary-500"
                                                           placeholder="$299" required="">
                                                </div>

                                                <div>
                                                    <label for="category"
                                                           class="block mb-2 text-sm font-medium text-gray-900 dark:text-white">Category</label>
                                                    <select id="category" name="category"
                                                            class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-primary-500 focus:border-primary-500 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-primary-500 dark:focus:border-primary-500">
                                                        <option selected="smartphone">Smart phone</option>
                                                        <option value="Smartwatch">Smart watch</option>
                                                        <option value="Earphones And Headphones">Earphone & Headphones</option>
                                                        <option value="chargers&cables">Chargers & Cables</option>
                                                        <option value="powerbanks">Power banks</option>
                                                    </select>
                                                </div>

                                                <div class="w-full">
                                                    <label for="image"
                                                           class="block mb-2 text-sm font-medium text-gray-900 dark:text-white ">Image</label>
                                                    <input type="file" name="image" id="image"
                                                           class="file-input file-input-bordered w-full max-w-xs"
                                                           required="">
                                                </div>
                                                <div class="sm:col-span-2">
                                                    <label for="description"
                                                           class="block mb-2 text-sm font-medium text-gray-900 dark:text-white">Description</label>
                                                    <textarea id="description" name="description" rows="8"
                                                              class="block p-2.5 w-full text-sm text-gray-900 bg-gray-50 rounded-lg border border-gray-300 focus:ring-primary-500 focus:border-primary-500 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-primary-500 dark:focus:border-primary-500"
                                                              placeholder="Write a product description here..."></textarea>
                                                </div>
                                            </div>
                                            <div class="flex items-center space-x-4">
                                                <button type="submit"
                                                        class="text-white bg-primary-700 hover:bg-primary-800 focus:ring-4 focus:outline-none focus:ring-primary-300 font-medium rounded-lg text-sm px-5 py-2.5 text-center dark:bg-primary-600 dark:hover:bg-primary-700 dark:focus:ring-primary-800">
                                                    Add product
                                                </button>
                                                <button type="reset"
                                                        class="text-red-600 inline-flex items-center hover:text-white border border-red-600 hover:bg-red-600 focus:ring-4 focus:outline-none focus:ring-red-300 font-medium rounded-lg text-sm px-5 py-2.5 text-center dark:border-red-500 dark:text-red-500 dark:hover:text-white dark:hover:bg-red-600 dark:focus:ring-red-900">
                                                    <svg class="w-5 h-5 mr-1 -ml-1" fill="currentColor"
                                                         viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg">
                                                        <path fill-rule="evenodd"
                                                              d="M9 2a1 1 0 00-.894.553L7.382 4H4a1 1 0 000 2v10a2 2 0 002 2h8a2 2 0 002-2V6a1 1 0 100-2h-3.382l-.724-1.447A1 1 0 0011 2H9zM7 8a1 1 0 012 0v6a1 1 0 11-2 0V8zm5-1a1 1 0 00-1 1v6a1 1 0 102 0V8a1 1 0 00-1-1z"
                                                              clip-rule="evenodd"></path>
                                                    </svg>
                                                    Clear
                                                </button>

                                            </div>
                                        </form>

                                        <div class="modal-action">
                                            <form method="dialog">
                                                <!-- if there is a button, it will close the model -->
                                                <button class="btn">Close</button>
                                            </form>
                                        </div>

                                    </div>
                                </dialog>


                                <dialog id="my_modal_4" class="modal">

                                    <div class="modal-box">
                                        <h2 class="mb-4 text-xl font-bold text-gray-900 dark:text-white">Update
                                            product</h2>
                                        <form id="editForm" action="#" method="post" enctype="multipart/form-data">

                                            <div class="grid gap-4 mb-4 sm:grid-cols-2 sm:gap-6 sm:mb-5">
                                                <div class="sm:col-span-2">
                                                    <label for="name"
                                                           class="block mb-2 text-sm font-medium text-gray-900 dark:text-white">Product
                                                        Name</label>
                                                    <input type="text" name="name" id="upName"
                                                           class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-primary-500 dark:focus:border-primary-500"
                                                           placeholder="Type product name" required="">
                                                </div>
                                                <div class="w-full">
                                                    <label for="brand"
                                                           class="block mb-2 text-sm font-medium text-gray-900 dark:text-white">Brand</label>
                                                    <input type="text" name="brand" id="upBrand"
                                                           class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-primary-500 dark:focus:border-primary-500"
                                                           placeholder="Product brand" required="">
                                                </div>
                                                <div class="w-full">
                                                    <label for="price"
                                                           class="block mb-2 text-sm font-medium text-gray-900 dark:text-white">Price</label>
                                                    <input type="number" name="price" id="upPrice"
                                                           class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-primary-500 dark:focus:border-primary-500"
                                                           placeholder="$299" required="">
                                                </div>
                                                <div>
                                                    <label for="category"
                                                           class="block mb-2 text-sm font-medium text-gray-900 dark:text-white">Category</label>
                                                    <select id="upCategory" name="category"
                                                            class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-primary-500 focus:border-primary-500 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-primary-500 dark:focus:border-primary-500">
                                                        <option selected="smartphone">Smart phone</option>
                                                        <option value="Smartwatch">Smart watch</option>
                                                        <option value="Earphones And Headphones">Earphone & Headphones</option>
                                                        <option value="chargers&cables">Chargers & Cables</option>
                                                        <option value="powerbanks">Power banks</option>
                                                    </select>
                                                </div>

                                                <div class="w-full">
                                                    <label for="image"
                                                           class="block mb-2 text-sm font-medium text-gray-900 dark:text-white">Image</label>
                                                    <input type="file" name="upImage" id="upImage"
                                                           class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-primary-500 dark:focus:border-primary-500"
                                                           required="">
                                                </div>
                                                <div class="sm:col-span-2">
                                                    <label for="description"
                                                           class="block mb-2 text-sm font-medium text-gray-900 dark:text-white">Description</label>
                                                    <textarea id="upDescription" name="description" rows="8"
                                                              class="block p-2.5 w-full text-sm text-gray-900 bg-gray-50 rounded-lg border border-gray-300 focus:ring-primary-500 focus:border-primary-500 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-primary-500 dark:focus:border-primary-500"
                                                              placeholder="Write a product description here..."></textarea>
                                                </div>
                                            </div>
                                            <div class="flex items-center space-x-4">
                                                <button type="submit"
                                                        class="text-white bg-primary-700 hover:bg-primary-800 focus:ring-4 focus:outline-none focus:ring-primary-300 font-medium rounded-lg text-sm px-5 py-2.5 text-center dark:bg-primary-600 dark:hover:bg-primary-700 dark:focus:ring-primary-800">
                                                    Update product
                                                </button>
                                                <button type="reset"
                                                        class="text-red-600 inline-flex items-center hover:text-white border border-red-600 hover:bg-red-600 focus:ring-4 focus:outline-none focus:ring-red-300 font-medium rounded-lg text-sm px-5 py-2.5 text-center dark:border-red-500 dark:text-red-500 dark:hover:text-white dark:hover:bg-red-600 dark:focus:ring-red-900">
                                                    <svg class="w-5 h-5 mr-1 -ml-1" fill="currentColor"
                                                         viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg">
                                                        <path fill-rule="evenodd"
                                                              d="M9 2a1 1 0 00-.894.553L7.382 4H4a1 1 0 000 2v10a2 2 0 002 2h8a2 2 0 002-2V6a1 1 0 100-2h-3.382l-.724-1.447A1 1 0 0011 2H9zM7 8a1 1 0 012 0v6a1 1 0 11-2 0V8zm5-1a1 1 0 00-1 1v6a1 1 0 102 0V8a1 1 0 00-1-1z"
                                                              clip-rule="evenodd"></path>
                                                    </svg>
                                                    Clear
                                                </button>

                                            </div>
                                        </form>

                                        <div class="modal-action">
                                            <form method="dialog">
                                                <!-- if there is a button, it will close the model -->
                                                <button class="btn">Close</button>
                                            </form>
                                        </div>

                                    </div>
                                </dialog>
                            </div>

                        </div>



                        <div role="tablist" class="tabs tabs-bordered" >
                            <input type="radio" name="my_tabs_1" role="tab" class="tab" aria-label="Products" checked/>

                            <div role="tabpanel" class="tab-content p-10" style="padding: 0">

                                <div class="overflow-x-auto sm:overflow-auto md:overflow-auto lg:overflow-auto xl:overflow-auto">

                                    <table class="w-full text-sm text-left text-gray-500 dark:text-gray-400 ">
                                    <thead class="text-xs text-gray-700 uppercase bg-gray-50 dark:bg-gray-700 dark:text-gray-400">
                                    <tr>



                                        <th scope="col" class="px-4 py-3">Image</th>
                                        <th scope="col" class="px-4 py-3" style="width: 50px">Product name</th>
                                        <th scope="col" class="px-4 py-3">Category</th>
                                        <th scope="col" class="px-4 py-3">Brand</th>
                                        <th scope="col" class="px-4 py-3">Description</th>
                                        <th scope="col" class="px-4 py-3">Price</th>
                                        <th scope="col" class="px-4 py-3">Quantity</th>
                                        <th scope="col" class="px-4 py-3">
                                            <span class="sr-only">Actions</span>
                                        </th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                <c:forEach var="product" items="${products}">
                                    <tr class="border-b dark:border-gray-700">
                                        <td class="px-4 py-3">
                                            <div class="flex items
                                        -center space-x-3">
                                                <img src="images/${product.getFileName()}" alt="Product image"
                                                     class="w-8 h-8 rounded-lg mask mask-squircle">
                                                <th scope="row"
                                                    class="px-4 py-3 font-medium text-gray-900 whitespace-nowrap dark:text-white">${product.getProductName()}
                                                </th>
                                            </div>
                                        </td>
                                        <td class="px-4 py-3">${product.getCategory()}
                                        </td>
                                        <td class="px-4 py-3">${product.getBrand()}
                                        </td>
                                        <td class="px-4 py-3">${product.getDescription()}
                                        </td>
                                        <td class="px-4 py-3">${product.getPrice()}
                                        </td>
                                        <td class="px-4 py-3">${product.getQuantity()}</td>
                                        <td class="px-4 py-3 flex items-center justify-end">
                                            <form style="padding: 5px">
                                                <button class="btn btn-success" type="button"
                                                        onclick="showEditModal('${product.getID()}', '${product.getProductName()}', '${product.getBrand()}', '${product.getPrice()}',
                                                                '${product.getCategory()}', '${product.getDescription()}', '${product.getFileName()}')"
                                                >Edit
                                                </button>
                                            </form>
                                            <form action="hello-servlet?method=delete&ID=${product.getID()}"
                                                  method="post" style="padding: 5px">
                                                <button class="btn btn-error" type="submit" onclick="showDeleteAlert()">
                                                    Delete
                                                </button>
                                            </form>
                                        </td>
                                    </tr>
                                </c:forEach>

                                    </tbody>
                                </table>

                                </div>

                            </div>

                            <input type="radio" name="my_tabs_1" role="tab" class="tab" aria-label="Users"/>
                            <div role="tabpanel" class="tab-content p-10">
                                <div class="overflow-x-auto">
                                    <table class="w-full text-sm text-left text-gray-500 dark:text-gray-400 ">
                                        <!-- head -->
                                        <thead class="text-xs text-gray-700 uppercase bg-gray-50 dark:bg-gray-700 dark:text-gray-400">
                                        <tr>

                                            <th scope="col" class="px-4 py-3">User Name</th>
                                            <th scope="col" class="px-4 py-3">Email</th>
                                            <th scope="col" class="px-4 py-3">First Name</th>
                                            <th scope="col" class="px-4 py-3">Last Name</th>
                                            <th scope="col" class="px-4 py-3"></th>
                                        </tr>
                                        </thead>
                                        <tbody>

                                <c:forEach var="user" items="${user}">
                                        <tr>
                                            <td class="px-4 py-3" style="font-weight: bold">
                                                <div class="badge badge-accent">${user.getUsername()}
                                                </div>
                                            </td>
                                            <td class="px-4 py-3">
                                                    ${user.getEmail()}
                                            </td>
                                            <td class="px-4 py-3">
                                                    ${user.getFirstName()}
                                            </td>
                                            <td class="px-4 py-3">
                                                    ${user.getLastName()}
                                            </td>
                                            <td class="px-4 py-3">
                                                <form action="user-servlet?method=delete&UID=${user.getUID()}"
                                                      method="post">
                                                    <button class="btn btn-error btn-xs">Remove</button>
                                                </form>
                                            </td>
                                        </tr>
                                </c:forEach>

                                        </tbody>
                                        <!-- foot -->

                                    </table>
                                </div>
                            </div>

                            <input type="radio" name="my_tabs_1" role="tab" class="tab" aria-label="Orders"/>
                            <div role="tabpanel" class="tab-content p-10">


                                <div class="overflow-x-auto">
                                    <table class="w-full text-sm text-left text-gray-500 dark:text-gray-400 ">
                                        <!-- head -->
                                        <thead class="text-xs text-gray-700 uppercase bg-gray-50 dark:bg-gray-700 dark:text-gray-400">
                                        <tr>

                                            <th scope="col" class="px-4 py-3">User Name</th>
                                            <th scope="col" class="px-4 py-3">Product</th>
                                            <th scope="col" class="px-4 py-3">Quantity</th>
                                            <th scope="col" class="px-4 py-3">Total Price</th>
                                            <th scope="col" class="px-4 py-3"></th>
                                        </tr>
                                        </thead>


                                        <tbody>

                                    <c:forEach var="order" items="${order}">
                                        <tr>

                                            <td class="px-4 py-3" style="font-weight: bold">


                                                <div class="badge badge-accent">

                                                    ${order.getOrderUserName()}
                                                </div>


                                            </td>

                                            <td class="px-4 py-3">


                                                ${order.getOrderProductName()}


                                            </td>
                                            <td class="px-4 py-3">


                                                ${order.getOrderQuantity() }


                                            </td>




                                            <td class="px-4 py-3">

                                                <c:set var="totalPrice" value="${order.getOrderPrice() * order.getOrderQuantity()}"/>
                                                ${totalPrice}


                                            </td>

                                            <td class="px-4 py-3">

                                                <button class="btn btn-error btn-xs">Remove</button>


                                            </td>
                                        </tr>

                                    </c:forEach>
                                        </tbody>


                                    </table>
                                </div>


                            </div>

                        </div>


                     </div>
                </div>
            </section>
        </div>
    </main>
</div>

</body>
</html>
